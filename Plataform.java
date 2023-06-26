import Domain.*;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

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
        //PD.info();
        ArrayList<String> Patata = new ArrayList<>();
        Patata.add("patata");

        PD.AddProduct("tapas", "brava", Patata, 5.5);
        PD.AddProduct("tapas", "chips", Patata, 5.0);
        PD.AddProduct("tapas", "arroz", Patata, 5.0);
        PD.AddProduct("tapas", "toufu", Patata, 5.0);
        PD.AddProduct("tapas", "huevo", Patata, 5.0);

        PD.info();

        ArrayList<String> area = new ArrayList<>();
        area.add("top");
        area.add("down");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(2);
        TaD = new TableDictionary(area, num, PD);
        TaD.info();

        TiD = new TicketDictionary(PD);
        Table x = TaD.getTable(1, "top");
        x.NewTicket(TiD);
    }
    Set<String> GetListProduct(){
        return PD.GetProductList();
    }

    public static void main(String[] args){
        Plataform p = new Plataform();
    }

}
