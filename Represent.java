import Representacion.*;

public class Represent {
    static Plataform PT;
    static Panel MP;
    static public void main(String[] arg){
        PT = new Plataform();
        MP = new Panel(PT.GetListProduct(), PT.GetListType(), PT.GetListIngre());
    }
}
