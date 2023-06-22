package Domain;

import java.util.ArrayList;

public class Product {
    ArrayList<String> ingredient;
    String name;
    Double price;
    Integer cant;

    Product(String name, Double price, ArrayList<String> ingredient){
        this.ingredient = new ArrayList<String>(ingredient);
        this.name = name;
        this.price = price;
        this.cant = 1;
    }
    void modiPrice(Double newPrice){
        this.price = newPrice;
    }
    void modCant(Integer t){
        this.cant = this.cant + t;
    }

    Double getPrice(){
        return this.price;
    }

    String getName(){
        return this.name;
    }

    ArrayList<String> getIngredient(){ return this.ingredient;}

}
