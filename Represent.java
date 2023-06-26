import Representacion.MainPanel;

public class Represent {
    static Plataform PT;
    static MainPanel MP;
    static public void main(String[] arg){
        PT = new Plataform();
        MP = new MainPanel(PT.GetListProduct());
    }
}
