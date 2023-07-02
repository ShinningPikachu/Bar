package Domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TableDictionary {
    HashMap<String, HashMap<Integer, Table>> allTables; //first element is area and second element is ID
    PriorityQueue<Integer> IDset;
    ArrayList<String> locations;
    HashMap<String, Integer> num;
    ProductDictionary PD;
    public TableDictionary(ArrayList<String> areas, ArrayList<Integer> number, ProductDictionary PD){
        this.PD = PD;
        this.locations = areas;
        Integer pos = 0;
        this.IDset = new PriorityQueue<>();
        this.allTables = new HashMap<>();
        this.num = new HashMap<>();
        for(int j = 1; j < 51; j++){//I have 1 to 50 IDs set up
            this.IDset.add(j);
        }
        for(String i:areas){
            this.allTables.put(i, new HashMap<Integer, Table>());
            this.num.put(i, number.get(pos));
            for(Integer j = 0; j < number.get(pos); j++){
                this.allTables.get(i).put(IDset.poll(), new Table(i, j));
            }
            pos = pos + 1;
        }
    }

    public void AddTable(String area){
        if(locations.contains(area)){
            Integer ID = IDset.poll();
            allTables.get(area).put(ID, new Table(area, ID));
            this.num.put(area, this.num.get(area)+1);
        }
    }
    public void DeleteTable(String area, Integer ID){
        if(locations.contains(area) && allTables.containsKey(area) && allTables.get(area).containsKey(ID)){
            IDset.add(ID);
            allTables.get(area).remove(ID);
            this.num.put(area, this.num.get(area)-1);
        }
    }
    public void AddArea(String area){
        allTables.put(area, new HashMap<>());
        this.locations.add(area);
        this.num.put(area, 0);
    }
    public void DeleteArea(String area){
        if(!allTables.get(area).isEmpty()){
            for (Integer i : allTables.get(area).keySet()){
                IDset.add(i);
            }
        }
        allTables.remove(area);
        this.locations.remove(area);
        this.num.remove(area);
    }
    public Table getTable(Integer ID, String area){
        return this.allTables.get(area).get(ID);
    }
    public HashMap<String, HashMap<Integer, Table>> GetTables() {
        return allTables;
    }
    public void info(){
        if(!allTables.isEmpty()){
            System.out.println(allTables);
        }else{
            System.out.println("Empty allTable");
        }
        if(!IDset.isEmpty()){
            System.out.println(IDset);
        }else{
            System.out.println("Empty IDset");
        }
        if(!locations.isEmpty()){
            System.out.println(locations);
        }else{
            System.out.println("Empty location");
        }
        if(!num.isEmpty()){
            System.out.println(num);
        }else{
            System.out.println("Empty num");
        }
    }
}
