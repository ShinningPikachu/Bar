package Domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TableDictionary {
    HashMap<String, HashMap<Integer, Table>> allTables; //first element is area and second element is ID
    PriorityQueue<Integer> IDset;
    ArrayList<String> locations;
    ArrayList<Integer> num;
    ProductDictionary PD;
    public TableDictionary(ArrayList<String> areas, ArrayList<Integer> number, ProductDictionary PD){
        this.PD = PD;
        this.locations = areas;
        this.num = number;
        Integer pos = 0;
        this.IDset = new PriorityQueue<>();
        for(int j = 1; j < 51; j++){//I have 1 to 50 IDs set up
            this.IDset.add(j);
        }
        for(String i:areas){
            this.allTables.put(i, new HashMap<Integer, Table>());
            for(Integer j = 0; j < number.get(pos); j++){
                this.allTables.get(i).put(IDset.poll(), new Table(i, j));
            }
            pos = pos + 1;
        }
    }

    void AddTable(String area){
        Integer ID = IDset.poll();
        allTables.get(area).put(ID, new Table(area, ID));
    }
    void DeleteTable(String area, Integer ID){
        IDset.add(ID);
        allTables.get(area).remove(ID);
    }
    void AddArea(String area){
        allTables.put(area, new HashMap<>());
    }
    void DeleteArea(String area){
        allTables.remove(area);

    }
}
