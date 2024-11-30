package Seventh;
import javax.swing.*;
import java.awt.*;

class ColorGraphicsSwingExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call superclass method to ensure proper rendering

        // Set background color
        setBackground(Color.LIGHT_GRAY);

        // Set text color and draw text
        g.setColor(Color.BLUE);
        g.drawString("Welcome to Color and Graphics Example!", 50, 50);

        // Draw a rectangle with a specific color
        g.setColor(Color.RED);
        g.drawRect(50, 80, 100, 50);

        // Fill a rectangle with a specific color
        g.setColor(Color.GREEN);
        g.fillRect(180, 80, 100, 50);

        // Draw a circle
        g.setColor(Color.ORANGE);
        g.drawOval(50, 150, 80, 80);

        // Fill a circle
        g.setColor(Color.MAGENTA);
        g.fillOval(180, 150, 80, 80);

        // Draw a line
        g.setColor(Color.BLACK);
        g.drawLine(50, 250, 300, 250);
    }

    public static void main(String[] args) {
        // Create a JFrame window
        JFrame frame = new JFrame("Color and Graphics Example");

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add our custom JPanel
        frame.add(new ColorGraphicsSwingExample());

        // Set the size of the frame
        frame.setSize(400, 300);

        // Make the frame visible
        frame.setVisible(true);
    }
}
