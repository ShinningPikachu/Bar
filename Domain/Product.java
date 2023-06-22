package Domain;

import java.util.ArrayList;

public class Product {
    ArrayList<String> ingredient;
    String name;
    Float price;

    void Product(String name, Float price){
        ingredient = new ArrayList<>();
        this.name = name;
        this.price = price;
    }
    void modiPrice(Float newPrice){
        this.price = newPrice;
    }

    Float getPrice(){
        return this.price;
    }

    String getName(){
        return this.name;
    }

}
