package Representacion;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Toolkit;
public class MainPanel {
    public static void main(String[] args) {
        // Create a JFrame to hold the interface components
        JFrame frame = new JFrame("Button Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Create a JPanel to hold the buttons
        JPanel panel = new JPanel();

        // Create multiple JButton instances and add them to the panel
        JButton button1 = new JButton("Button 1");
        panel.add(button1);

        JButton button2 = new JButton("Button 2");
        panel.add(button2);

        JButton button3 = new JButton("Button 3");
        panel.add(button3);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Set the size of the frame and make it visible
        frame.setSize(screenSize.width, screenSize.height);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setVisible(true);
    }
}
