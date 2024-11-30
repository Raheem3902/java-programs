package Ninth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class EventHandlingExample extends JFrame {

    // Constructor
    public EventHandlingExample() {
        // Set JFrame properties
        setTitle("Event Handling Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add MouseListener using an anonymous class
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Mouse clicked at: " + e.getX() + ", " + e.getY());
            }
        });

        // Add KeyListener using an anonymous class
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                JOptionPane.showMessageDialog(null, "Key pressed: " + e.getKeyChar());
            }
        });

        // Set the frame to be focusable to capture keyboard events
        setFocusable(true);
        setLocationRelativeTo(null);  // Center the window
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EventHandlingExample ex = new EventHandlingExample();
            ex.setVisible(true);  // Show the JFrame
        });
    }
}

