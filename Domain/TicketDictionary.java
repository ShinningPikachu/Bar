package Domain;

import java.util.ArrayList;
import java.util.HashMap;

public class TicketDictionary {
    HashMap<Integer,Ticket> allTicket;
    ProductDictionary PD;
    Integer counter;
    public TicketDictionary(ProductDictionary PD){
        this.allTicket = new HashMap<>();
        this.counter = 0;
        this.PD = PD;
    }
    Ticket NewTickets(){
        Ticket p = new Ticket(this.counter, PD);
        allTicket.put(this.counter, p);
        this.counter++;
        return p;

    }
}
