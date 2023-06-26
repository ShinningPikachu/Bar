package Domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.LocalTime;

public class TicketDictionary {
    HashMap<Integer,Ticket> allTicket;
    ProductDictionary PD;
    Integer counter;
    public TicketDictionary(ProductDictionary PD){
        this.allTicket = new HashMap<>();
        this.counter = 0;
        this.PD = PD;
    }
    Ticket NewTickets(String area, Integer tableID){
        Ticket p = new Ticket(this.counter, PD, String.valueOf(LocalDate.now()), String.valueOf(LocalTime.now().getHour()) +":"+ String.valueOf(LocalTime.now().getMinute() ), area, tableID);
        allTicket.put(this.counter, p);
        this.counter++;
        return p;
    }
}
