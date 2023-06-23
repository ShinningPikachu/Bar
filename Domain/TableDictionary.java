package Domain;

import java.util.ArrayList;
import java.util.HashMap;

public class TableDictionary {
    HashMap<String, HashMap<Integer, Table>> allTables;
    ArrayList<String> locations;
    ArrayList<Integer> num;
    public TableDictionary(ArrayList<String> areas, ArrayList<Integer> number){
        this.locations = areas;
        this.num = number;
        Integer pos = 0;
        for(String i:areas){
            allTables.put(i, new HashMap<Integer, Table>());
            for(Integer j = 0; j < number.get(pos); j++){
                allTables.get(i).put(j, new Table(i, j));
            }
        }
    }

    void AddTable(String area, Integer ID){
        allTables.get(area).put(ID, new Table(area, ID));
    }
    void DeleteTable(String area, Integer ID){
        allTables.get(area).remove(ID);
    }

    void AddArea(String area){
        allTables.put(area, new HashMap<>());
    }

    void DeleteArea(String area){
        allTables.remove(area);
    }
}
