import javax.swing.*;
import java.awt.*;
public class Test {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Matrix Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create the main container JPanel
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(3, 3)); // 3 rows, 3 columns

        // Create and add buttons to the container panel
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("Button " + i);
            container.add(button);
        }

        // Add the container to the frame's content pane
        frame.getContentPane().add(container);

        // Make the frame visible
        frame.setVisible(true);
    }
}
