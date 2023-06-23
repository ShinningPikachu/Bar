package Domain;

import java.util.ArrayList;

public class Product {
    ArrayList<String> ingredient;
    String name;
    Double price;

    Product(String name, Double price, ArrayList<String> ingredient){
        this.ingredient = new ArrayList<String>(ingredient);
        this.name = name;
        this.price = price;
    }
    void modiPrice(Double newPrice){
        this.price = newPrice;
    }

    Double getPrice(){
        return this.price;
    }

    String getName(){
        return this.name;
    }

    ArrayList<String> getIngredient(){ return this.ingredient;}

}
