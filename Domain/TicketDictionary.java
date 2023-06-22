package Domain;

import java.util.ArrayList;
import java.util.HashMap;

public class TicketDictionary {
    HashMap<Integer,Ticket> allTicket;
    Integer counter;
    TicketDictionary(){
        this.allTicket = new HashMap<>();
        this.counter = 0;
    }
    Ticket NewTickets(){
        Ticket p = new Ticket(this.counter);
        allTicket.put(this.counter, p);
        this.counter++;
        return p;

    }
}
