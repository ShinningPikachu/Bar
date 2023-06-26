package Representacion;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Set;

public class MainPanel {

    public MainPanel(Set<String> allProduct){
        // Create a JFrame to hold the interface components
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Create a JPanel to hold the buttons
        JPanel panel = new JPanel();

        for (String element : allProduct) {
            JButton button = new JButton(element);
            panel.add(button);
        }

        JScrollPane scrollPane = new JScrollPane(panel);

        scrollPane.setPreferredSize(new Dimension(screenSize.width, screenSize.height));

        frame.getContentPane().add(scrollPane);
        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Set the size of the frame and make it visible
        frame.setSize(screenSize.width, screenSize.height);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setVisible(true);
    }
}
