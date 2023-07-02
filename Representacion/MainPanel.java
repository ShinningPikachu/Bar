package Representacion;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class MainPanel {
    private JPanel Main;
    private JPanel tables;
    private JPanel terraza;
    private JPanel down;
    private JPanel top;
    private JPanel products;
    private JPanel type;
    private JPanel ingredient;
    private JPanel allproduct;
    private JPanel ticket;
    private JPanel ticketBottom;
    private JPanel ticketzone;

    public MainPanel(){
        terraza.setBackground(Color.BLUE);
        down.setBackground(Color.BLACK);
        top.setBackground(Color.CYAN);

        type.setBackground(Color.GRAY);
        ingredient.setBackground(Color.GREEN);
        allproduct.setBackground(Color.MAGENTA);

        ticket.setBackground(Color.RED);
        ticketBottom.setBackground(Color.BLUE);
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Frame with Different Panel Sizes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the frame to occupy the entire screen
        frame.setContentPane(new MainPanel().Main);
        frame.pack();
        frame.setVisible(true);
    }
}
