package Domain;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public class Ticket {
    HashMap<String, Product> allProduct;
    HashMap<String, Integer> productCant;
    HashMap<String, Double> productPrice;
    ProductDictionary PD;
    Double totalPrice;
    Integer ID;
    Date data;
    Time time;

    Ticket(Integer ID, ProductDictionary PD){
        this.allProduct = new HashMap<>();
        this.productCant = new HashMap<>();
        this.productPrice = new HashMap<>();
        this.totalPrice = 0.0;
        this.ID = ID;
        this.PD = PD;
    }

    Integer GetID(){
        return this.ID;
    }

    void AddProduct(String name, Double price, ArrayList<String> ingre, ProductDictionary dic){
        if(allProduct.containsKey(name)){
            productCant.put(name, productCant.get(name)+1);

        }else{
            //Add a product in ticket, but is necessary to define a continues function to do that.
        }

    }

    void ChangePrice(String name, Double newprice){
        if(allProduct.containsKey(name)){
            productPrice.put(name, newprice);
        }
    }



}
