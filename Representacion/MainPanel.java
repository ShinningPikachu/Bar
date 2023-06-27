package Representacion;
import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class MainPanel {
    private JPanel mainPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JFrame frame;

    public MainPanel(Set<String> allProduct){
        // Create a JFrame to hold the interface components
        frame = new JFrame("Frame with Different Panel Sizes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the frame to occupy the entire screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Create the main panel
        mainPanel = new JPanel(new BorderLayout());

        // Create sub-panel 1 with specific size
        panel1 = new JPanel();
        for (String element : allProduct) {
            JButton button = new JButton(element);
            panel1.add(button);
        }
        panel1.setBackground(Color.RED);
        panel1.setPreferredSize(new Dimension(2*screenSize.width/5, screenSize.height));
        mainPanel.add(panel1, BorderLayout.LINE_START);

        // Create sub-panel 2 with specific size
        panel2 = new JPanel();
        for (String element : allProduct) {
            JButton button = new JButton(element);
            panel2.add(button);
        }
        panel2.setBackground(Color.GREEN);
        panel2.setPreferredSize(new Dimension(2*screenSize.width/5, screenSize.height));
        mainPanel.add(panel2, BorderLayout.CENTER);

        // Create sub-panel 3 with specific size
        panel3 = new JPanel();
        for (String element : allProduct) {
            JButton button = new JButton(element);
            panel3.add(button);
        }
        panel3.setBackground(Color.BLUE);
        panel3.setPreferredSize(new Dimension(2*screenSize.width/5, screenSize.height));
        mainPanel.add(panel3, BorderLayout.LINE_END);

        frame.setContentPane(mainPanel);
        frame.setSize(screenSize.width, screenSize.height);
        frame.setVisible(true);
    }
}
