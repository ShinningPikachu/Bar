package Domain;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Product {
    ArrayList<String> ingredient;
    String name;
    Double price;
    String type;

    Product(String name, Double price, ArrayList<String> ingredient, String type){
        this.ingredient = new ArrayList<String>(ingredient);
        this.name = name;
        this.price = price;
        this.type = type;
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
    String getType(){return this.type;}
    ArrayList<String> getIngredient(){ return this.ingredient;}
    void AddIngredient(String newIngredient){
        ingredient.add(newIngredient);
    }
    void DeleteIngredient(String oldIngredient){
        ingredient.remove(oldIngredient);
    }
    void modName(String newName){
        this.name = newName;
    }

}
