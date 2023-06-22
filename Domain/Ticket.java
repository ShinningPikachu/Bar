package Domain;

import java.util.ArrayList;

public class Ticket {
    ArrayList<Product> allProduct;
    Float totalPrice;

    void Ticket(){
        this.allProduct = new ArrayList<>();
        this.totalPrice = 0.f;
    }

}
