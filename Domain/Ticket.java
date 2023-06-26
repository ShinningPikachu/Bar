package Domain;

import java.time.LocalDate;
import java.util.HashMap;
public class Ticket {
    HashMap<String, Product> allProduct;
    HashMap<String, HashMap<Double, Integer>> namePriceCant;
    ProductDictionary PD;
    Double totalPrice;
    Integer ID;
    String data;
    String time;
    Integer tableID;
    String area;

    Ticket(Integer ID, ProductDictionary PD, String data, String time, String area, Integer tableID){
        this.allProduct = new HashMap<>();
        this.namePriceCant = new HashMap<>();
        this.totalPrice = 0.0;
        this.ID = ID;
        this.PD = PD;
        this.data = data;
        this.time = time;
        this.tableID = tableID;
        this.area = area;
    }

    Integer GetID(){
        return this.ID;
    }

    void AddProduct(String name, Double price){
        if(allProduct.containsKey(name)){
            if(namePriceCant.get(name).containsKey(price)){
                namePriceCant.get(name).put(price, namePriceCant.get(name).get(price) + 1);
            }else{
                namePriceCant.get(name).put(price, 1);
            }
        }else{
            this.allProduct.put(name, PD.getProduct(name));
            this.namePriceCant.put(name, new HashMap<>());
            this.namePriceCant.get(name).put(price, 1);
        }
    }

    void ChangePrice(String name, Double newprice, Double oldprice){
        if(allProduct.containsKey(name) && namePriceCant.containsKey(name)){
            Integer cant = namePriceCant.get(name).get(oldprice);
            if(!namePriceCant.get(name).containsKey(newprice)){
                namePriceCant.get(name).put(newprice,cant);
            }else{
                namePriceCant.get(name).put(newprice,namePriceCant.get(name).get(newprice));
            }
        }
    }

    void DeleteProduct(String name, Double price){
        if(namePriceCant.containsKey(name) && namePriceCant.get(name).containsKey(price)){
            namePriceCant.get(name).remove(price);
            if(namePriceCant.get(name).isEmpty()){
                namePriceCant.remove(name);
                allProduct.remove(name);
            }
        }
    }



}
