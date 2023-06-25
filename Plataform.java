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
        //PD.info();
        ArrayList<String> Patata = new ArrayList<>();
        Patata.add("patata");

        PD.AddProduct("tapas", "brava", Patata, 5.5);

        PD.info();

        PD.ChangeName("brava", "bravaPatata");

        PD.info();

        PD.AddProduct("tapas", "brava", Patata, 6.5);

        PD.info();

        PD.ModIngredientAdd("brava", "sal");

        PD.info();

        PD.ModIngredientDelete("brava", "patata");

        PD.info();

        System.out.println(PD.FindWithIngredient("patata"));

        System.out.println(PD.FindWithIngredient("sal"));

        PD.CleanSearch();

        System.out.println(PD.FindWithIngredient("sal"));



        /*
        ArrayList<String> area = new ArrayList<>();
        area.add("top");
        area.add("down");
        area.add("out");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(2);
        num.add(2);
        TaD = new TableDictionary(area, num, PD);

        TiD = new TicketDictionary(PD);*/
    }

    public static void main(String[] args){
        Plataform p = new Plataform();
    }

}
