package Domain;

import java.util.ArrayList;
import java.util.HashMap;

//This class maintain all products sets, and helps to find what is needed efficiently
public class ProductDictionary {
    Boolean Mode = false; //Set manually
    HashMap<String, Product> Tapas;
    HashMap<String, Product> Bocadillo;
    HashMap<String, ArrayList<Product>> Ingredient;

    ArrayList<String> actualResult;

    void Initialize(){
        //Do something
    }

    void FindWithIngredient(){
        this.actualResult = new ArrayList<>(); //need to change
    }


}
