import Domain.*;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Set;

public class Plataform {
    //do something
    static ProductDictionary PD;
    static TableDictionary TaD;
    static TicketDictionary TiD;

    Plataform(ArrayList<String> type, ArrayList<String> ingre, ArrayList<String> area, ArrayList<Integer> num){
        PD = new ProductDictionary(type, ingre);
        //PD.info();
        ArrayList<String> Patata = new ArrayList<>();
        Patata.add("patata");

        PD.AddProduct("tapas", "brava", Patata, 5.5);
        PD.AddProduct("tapas", "chips", Patata, 5.0);
        PD.AddProduct("tapas", "arroz", Patata, 5.0);
        PD.AddProduct("tapas", "toufu", Patata, 5.0);
        PD.AddProduct("tapas", "huevo", Patata, 5.0);

        //PD.info();

        TaD = new TableDictionary(area, num, PD);
        TaD.info();

        TiD = new TicketDictionary(PD);
        Table x = TaD.getTable(1, "top");
        x.NewTicket(TiD);
    }
    public Set<String> GetListProduct(){
        return PD.GetProductList();
    }
    public ArrayList<String> GetListType(){return PD.GetTypeList();}
    public ArrayList<String> GetListIngre(){
        return PD.GetIngreList();
    }
    public HashMap<String, HashMap<Integer, Table>> GetTables(){ return this.TaD.GetTables();}

    public static void main(String[] args){
        //Plataform p = new Plataform();
    }

}
