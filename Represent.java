import Representacion.*;

import java.util.ArrayList;

public class Represent {
    static Plataform PT;
    static Panel MP;
    static public void main(String[] arg){
        ArrayList<String> type = new ArrayList<>();
        type.add("tapas");
        type.add("bocadillo");
        ArrayList<String> ingre = new ArrayList<>();
        ingre.add("huevo");
        ingre.add("ensalada");
        ingre.add("patata");
        ArrayList<String> area = new ArrayList<>();
        area.add("top");
        area.add("down");
        area.add("terraza");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(2);
        num.add(6);
        PT = new Plataform(type, ingre,area, num);
        MP = new Panel(PT.GetListProduct(), PT.GetListType(), PT.GetListIngre(), PT.GetTables());

    }


}
