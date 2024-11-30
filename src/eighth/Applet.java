package eighth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseKeyEventDemo extends JFrame implements MouseListener, KeyListener {

    // Message to display based on events
    String message = "";

    public MouseKeyEventDemo() {
        setTitle("Mouse and Key Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window
        addMouseListener(this);      // Register mouse listener
        addKeyListener(this);        // Register key listener
        setFocusable(true);          // Make sure the frame can focus for key events
    }

    // Paint method to display the message
    public void paint(Graphics g) {
        super.paint(g);  // Call the parent class paint method
        g.setColor(Color.BLACK);  // Set the text color
        g.drawString(message, 100, 100);  // Display the message
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        message = "Mouse Clicked at: " + e.getX() + ", " + e.getY();  // Get mouse position
        repaint();  // Repaint the frame
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    // KeyListener methods
    public void keyPressed(KeyEvent e) {
        message = "Key Pressed: " + e.getKeyChar();  // Get key pressed
        repaint();  // Repaint the frame
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    // Main method to run the program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MouseKeyEventDemo().setVisible(true);  // Show the frame
        });
    }
}
