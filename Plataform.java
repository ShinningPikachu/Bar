import Domain.*;

import java.util.ArrayList;

public class Plataform {
    //do something
    static ProductDictionary PD;
    static TableDictionary TaD;
    static TicketDictionary TiD;

    Plataform(){
        ArrayList<String> type = new ArrayList<>();
        type.add("tapas");
        type.add("bocadillo");
        ArrayList<String> ingre = new ArrayList<>();
        ingre.add("huevo");
        ingre.add("ensalada");
        ingre.add("patata");
        PD = new ProductDictionary(type, ingre);

        ArrayList<String> area = new ArrayList<>();
        area.add("top");
        area.add("down");
        area.add("out");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(2);
        num.add(2);
        TaD = new TableDictionary(area, num);

        TiD = new TicketDictionary();
    }

}
