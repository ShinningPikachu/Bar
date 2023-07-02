package Domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

//This class maintain all products sets, and helps to find what is needed efficiently
public class ProductDictionary {
    Boolean Mode = false; //Set manually
    static HashMap<String, HashMap<String, Product>> Ingredient;
    static HashMap<String, HashMap<String, Product>> Type;
    static HashMap<String, Product> All;
    static ArrayList<String> ingred;
    static ArrayList<String> type;
    static ArrayList<String> ingredSearch;
    static ArrayList<String> typeSearch;
    static HashMap<String, Product> actualResult;


    public ProductDictionary(ArrayList<String> type, ArrayList<String> ingred){
        this.Ingredient = new HashMap<>();
        this.Type = new HashMap<>();
        this.All = new HashMap<>();
        this.ingred = new ArrayList<>(ingred);
        this.type = new ArrayList<>(type);
        this.actualResult = new HashMap<>();
        this.ingredSearch = new ArrayList<>();
        this.typeSearch = new ArrayList<>();
        for(String i : this.type){
            this.Type.put(i, new HashMap<>());
        }
        for(String i : this.ingred){
            this.Ingredient.put(i, new HashMap<>());
        }
    }
    public Set<String> FindWithIngredient(String name){
        this.ingredSearch.add(name);
        this.actualResult = Intersection(); //need to change
        return this.actualResult.keySet();
    }
    public Set<String> FindWithCategory(String name){
        this.typeSearch.add(name);
        this.actualResult = Intersection();
        return this.actualResult.keySet();
    }
    public void CleanSearch(){ingredSearch.clear(); typeSearch.clear();}
    public void AddProduct(String type, String name, ArrayList<String> ingre, Double price){
        Product n = new Product(name, price, ingre, type);
        All.put(name, n);
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
        actualResult = All;
    }

    public void DeleteProduct(String type, String name){
        Product p = Type.get(type).get(name);
        All.remove(name);
        actualResult.remove(name);
        Type.get(type).remove(name);
        ArrayList<String> x = p.getIngredient();
        for(String i: x){
            Ingredient.get(i).remove(name);
        }
    }

    //Make intersection of teo hash map
    public HashMap<String, Product> Intersection(){
        HashMap<String, Product> test = new HashMap<>(this.All);
        for(String i : ingredSearch){
            if(Type.containsKey(i)){
                test.keySet().retainAll(Ingredient.get(i).keySet());
            }
        }
        for(String i : typeSearch){
            if(Ingredient.containsKey(i)){
                test.keySet().retainAll(Type.get(i).keySet());
            }
        }
        return test;
    }
    public Product getProduct(String name){
        return All.get(name);
    }

    public Set<String> GetProductList(){
        return actualResult.keySet();
    }
    public ArrayList<String> GetTypeList(){
        return this.type;
    }
    public ArrayList<String> GetIngreList(){
        return this.ingred;
    }

    public void ChangePrice(String name, Double newPrice){
        if(All.containsKey(name)){
            this.All.get(name).modiPrice(newPrice);
        }
    }

    public void ChangeName(String oldName, String newName){
        if(All.containsKey(oldName) && !All.containsKey(newName)){
            Product p =  All.get(oldName);
            p.modName(newName);
            All.remove(oldName);
            All.put(newName, p);
            Type.get(p.getType()).remove(oldName);
            Type.get(p.getType()).put(newName, p);
            actualResult.remove(oldName);
            actualResult.put(newName, p);
            for(String i : p.getIngredient()){
                Ingredient.get(i).remove(oldName);
                Ingredient.get(i).put(newName, p);
            }
        }
    }

    public void ModIngredientDelete(String name, String oldIngredient){
        if(All.containsKey(name) && Ingredient.containsKey(oldIngredient) && Ingredient.get(oldIngredient).containsKey(name)){
            All.get(name).DeleteIngredient(oldIngredient);
            Ingredient.get(oldIngredient).remove(name);
        }
    }

    public void ModIngredientAdd(String name, String newIngredient){
        All.get(name).AddIngredient(newIngredient);
        if(Ingredient.containsKey(newIngredient)){
            Ingredient.get(newIngredient).put(name, All.get(name));
        }else{
            Ingredient.put(newIngredient, new HashMap<>());
            Ingredient.get(newIngredient).put(name, All.get(name));
        }
    }

    public void info(){
        if(!ingred.isEmpty()){
            System.out.println(ingred);
        }else{
            System.out.println("Ingredient is empty");
        }
        if(!type.isEmpty()){
            System.out.println(type);
        }else{
            System.out.println("Type is empty");
        }
        if(!Ingredient.isEmpty()){
            System.out.println(Ingredient);
        }else{
            System.out.println("Ingredient none");
        }
        if(!Type.isEmpty()){
            System.out.println(Type);
        }else{
            System.out.println("Type none");
        }
        if(!All.isEmpty()){
            System.out.println(All);
        }else{
            System.out.println("All empty");
        }
        if(!actualResult.isEmpty()){
            System.out.println(actualResult);
        }else{
            System.out.println("actualResult empty");
        }
        System.out.println("-------------------------");
    }

}
