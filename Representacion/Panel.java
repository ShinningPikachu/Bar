package Representacion;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Set;

public class Panel {
    JFrame frame;
    JPanel mainPanel;
    JPanel tablePanel;
    JPanel tablepanel1;
    JPanel tablepanel2;
    JPanel tablepanel3;

    JPanel productPanel;

    JPanel productpanel1;
    JPanel productpanel2;
    JPanel productpanel3;

    JPanel ticketPanel;
    JPanel ticketpanel1;
    JPanel ticketpanel2;
    Dimension screenSize;
    public Panel(Set<String> productlist, ArrayList<String> typelist, ArrayList<String> ingrelist){
        IniFrame();
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.GRAY);

        SetTablePanel();
        mainPanel.add(tablePanel);

        SetProductPanel(productlist, typelist, ingrelist);
        mainPanel.add(productPanel);

        SetTicketPanel();
        mainPanel.add(ticketPanel);

        frame.setContentPane(mainPanel);
        frame.pack();

        // Make the frame visible
        frame.setVisible(true);
    }
    private void IniFrame(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        DisplayMode displayMode = gd.getDisplayMode();
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        screenSize = new Dimension(displayMode.getWidth()-100, displayMode.getHeight()-100);
        frame.setPreferredSize(screenSize);
    }
    private void SetTablePanel(){
        tablePanel = new JPanel();
        tablePanel.setBackground(Color.MAGENTA);
        tablePanel.setPreferredSize(new Dimension(screenSize.width/3, screenSize.height));

        tablepanel1 = new JPanel();
        tablepanel1.setBackground(java.awt.Color.RED);
        tablepanel1.setPreferredSize(new Dimension(tablePanel.getPreferredSize().width, tablePanel.getPreferredSize().height/3));
        tablePanel.add(tablepanel1);

        tablepanel2 = new JPanel();
        tablepanel2.setBackground(java.awt.Color.BLUE);
        tablepanel2.setPreferredSize(new Dimension(tablePanel.getPreferredSize().width, tablePanel.getPreferredSize().height/3));
        tablePanel.add(tablepanel2);

        tablepanel3 = new JPanel();
        tablepanel3.setBackground(java.awt.Color.GREEN);
        tablepanel3.setPreferredSize(new Dimension(tablePanel.getPreferredSize().width, tablePanel.getPreferredSize().height/3));
        tablePanel.add(tablepanel3);
    }

    private void SetProductPanel(Set<String> productlist, ArrayList<String> typelist, ArrayList<String> ingrelist){
        productPanel = new JPanel();
        productPanel.setBackground(Color.BLACK);
        productPanel.setPreferredSize(new Dimension(screenSize.width/3, screenSize.height));

        productpanel1 = new JPanel();
        productpanel1.setBackground(java.awt.Color.RED);
        productpanel1.setPreferredSize(new Dimension(productPanel.getPreferredSize().width/4-10, productPanel.getPreferredSize().height));
        for(String i : typelist){
            JButton but = new JButton(i);
            productpanel1.add(but);
        }
        JButton butP1 = new JButton("+Tipo");
        productpanel1.add(butP1);
        productPanel.add(productpanel1);

        productpanel2 = new JPanel();
        productpanel2.setBackground(java.awt.Color.BLUE);
        productpanel2.setPreferredSize(new Dimension(productPanel.getPreferredSize().width/4-10, productPanel.getPreferredSize().height));
        for(String i : ingrelist){
            JButton but = new JButton(i);
            productpanel2.add(but);
        }
        JButton butP2 = new JButton("+Ingrediente");
        productpanel2.add(butP2);
        productPanel.add(productpanel2);

        productpanel3 = new JPanel();
        productpanel3.setBackground(java.awt.Color.GREEN);
        productpanel3.setPreferredSize(new Dimension(productPanel.getPreferredSize().width/3, productPanel.getPreferredSize().height));
        for(String i : productlist){
            JButton but = new JButton(i);
            productpanel3.add(but);
        }
        JButton butP3 = new JButton("+Producto");
        productpanel3.add(butP3);
        productPanel.add(productpanel3);
    }

    private void SetTicketPanel(){
        ticketPanel = new JPanel();
        ticketPanel.setBackground(Color.CYAN);
        ticketPanel.setPreferredSize(new Dimension(screenSize.width/3, screenSize.height));

        ticketpanel1 = new JPanel();
        ticketpanel1.setBackground(java.awt.Color.BLUE);
        ticketpanel1.setPreferredSize(new Dimension(ticketPanel.getPreferredSize().width, ticketPanel.getPreferredSize().height/2+200));
        ticketPanel.add(ticketpanel1);

        ticketpanel2 = new JPanel();
        ticketpanel2.setBackground(java.awt.Color.GREEN);
        ticketpanel2.setPreferredSize(new Dimension(ticketPanel.getPreferredSize().width, ticketPanel.getPreferredSize().height/2-200));
        ticketPanel.add(ticketpanel2);
    }
    public static void main(String[] arg){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        DisplayMode displayMode = gd.getDisplayMode();


        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension screenSize = new Dimension(displayMode.getWidth()-100, displayMode.getHeight()-100);
        frame.setPreferredSize(screenSize);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.GRAY);

        JPanel tablePanel = new JPanel();
        tablePanel.setBackground(Color.MAGENTA);
        tablePanel.setPreferredSize(new Dimension(screenSize.width/3, screenSize.height));

        JPanel panel1 = new JPanel();
        panel1.setBackground(java.awt.Color.RED);
        panel1.setPreferredSize(new Dimension(tablePanel.getPreferredSize().width, tablePanel.getPreferredSize().height/3));
        tablePanel.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(java.awt.Color.BLUE);
        panel2.setPreferredSize(new Dimension(tablePanel.getPreferredSize().width, tablePanel.getPreferredSize().height/3));
        tablePanel.add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setBackground(java.awt.Color.GREEN);
        panel3.setPreferredSize(new Dimension(tablePanel.getPreferredSize().width, tablePanel.getPreferredSize().height/3));
        tablePanel.add(panel3);
        mainPanel.add(tablePanel);

        JPanel productPanel = new JPanel();
        productPanel.setBackground(Color.BLACK);
        productPanel.setPreferredSize(new Dimension(screenSize.width/3, screenSize.height));

        JPanel ppanel1 = new JPanel();
        ppanel1.setBackground(java.awt.Color.RED);
        ppanel1.setPreferredSize(new Dimension(productPanel.getPreferredSize().width/4-10, productPanel.getPreferredSize().height));
        productPanel.add(ppanel1);

        JPanel ppanel2 = new JPanel();
        ppanel2.setBackground(java.awt.Color.BLUE);
        ppanel2.setPreferredSize(new Dimension(productPanel.getPreferredSize().width/4-10, productPanel.getPreferredSize().height));
        productPanel.add(ppanel2);

        JPanel ppanel3 = new JPanel();
        ppanel3.setBackground(java.awt.Color.GREEN);
        ppanel3.setPreferredSize(new Dimension(productPanel.getPreferredSize().width/3, productPanel.getPreferredSize().height));
        productPanel.add(ppanel3);
        mainPanel.add(productPanel);


        JPanel ticketPanel = new JPanel();
        ticketPanel.setBackground(Color.CYAN);
        ticketPanel.setPreferredSize(new Dimension(screenSize.width/3, screenSize.height));

        JPanel pppanel2 = new JPanel();
        pppanel2.setBackground(java.awt.Color.BLUE);
        pppanel2.setPreferredSize(new Dimension(ticketPanel.getPreferredSize().width, ticketPanel.getPreferredSize().height/2));
        ticketPanel.add(pppanel2);

        JPanel pppanel3 = new JPanel();
        pppanel3.setBackground(java.awt.Color.GREEN);
        pppanel3.setPreferredSize(new Dimension(ticketPanel.getPreferredSize().width, ticketPanel.getPreferredSize().height/2));
        ticketPanel.add(pppanel3);
        mainPanel.add(ticketPanel);

        frame.setContentPane(mainPanel);
        frame.pack();

        // Make the frame visible
        frame.setVisible(true);

    }
}
