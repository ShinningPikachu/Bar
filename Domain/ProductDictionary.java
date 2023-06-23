package Domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

//This class maintain all products sets, and helps to find what is needed efficiently
public class ProductDictionary {
    Boolean Mode = false; //Set manually
    static HashMap<String, HashMap<String, Product>> Ingredient;
    static HashMap<String, HashMap<String, Product>> Type;
    static HashMap<String, Product> All;
    static ArrayList<String> ingred;
    static ArrayList<String> type;

    HashMap<String, Product> actualResult;


    public ProductDictionary(ArrayList<String> type, ArrayList<String> ingred){
        this.Ingredient = new HashMap<>();
        this.Type = new HashMap<>();
        this.All = new HashMap<>();
        this.ingred = new ArrayList<>(ingred);
        this.type = new ArrayList<>(type);
        for(String i : this.type){
            this.Type.put(i, new HashMap<>());
        }
        for(String i : this.ingred){
            this.Ingredient.put(i, new HashMap<>());
        }
    }
    ArrayList<String> FindWithIngredient(String name){
        this.actualResult = Intersection(this.actualResult, this.Ingredient.get(name)); //need to change
        return (ArrayList<String>) this.actualResult.keySet();
    }
    ArrayList<String> FindWithCategory(String name){
        this.actualResult = Intersection(this.actualResult, this.Type.get(name));
        return (ArrayList<String>) this.actualResult.keySet();
    }
    void CleanSearch(){this.actualResult.clear();}
    void AddProduct(String type, String name, ArrayList<String> ingre, Double price){
        Product n = new Product(name, price, ingre);
        if(!Type.containsKey(type)){
            Type.put(type, new HashMap<>());
            this.type.add(type);
        }
        this.Type.get(type).put(name, n);
        for(String i:ingre){
            if(!this.Ingredient.containsKey(i)) {
                Ingredient.put(i, new HashMap<>());
                ingred.add(i);
            }
            this.Ingredient.get(i).put(name, n);
        }
    }
    void DeleteProduct(String type, String name){
        Product p = Type.get(type).get(name);
        Type.get(type).remove(name);
        ArrayList<String> x = p.getIngredient();
        for(String i: x){
            Ingredient.get(i).remove(name);
        }
    }
    //Make intersection of teo hash map
    HashMap<String, Product> Intersection(HashMap<String, Product> a, HashMap<String, Product> b){
        HashMap<String, Product> test = new HashMap<>(a);
        test.keySet().retainAll(b.keySet());
        return test;
    }

}
