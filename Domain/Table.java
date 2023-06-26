package Domain;

import java.util.ArrayList;

public class Table {
    String location;
    Double value;
    Ticket assign;
    Integer ID;

    Table(String location, Integer ID){
        this.location = location;
        this.value = 0.0;
        this.ID = ID;
    }
    public void NewTicket(TicketDictionary x){
        assign=x.NewTickets(this.location, this.ID);
    }

    public Ticket getTicket(){return this.assign;}

    public void DeleteTicket(){
        this.assign = null;
    }


}
