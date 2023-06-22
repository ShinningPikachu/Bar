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
    void NewTicket(TicketDictionary x){
        assign=x.NewTickets();
    }

    void AddProduct(){
        //assign.AddProduct("", 0.0, new ArrayList<>(), xx);
    }
}
