package Seventh;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class AWTExample {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("AWT Example");

        // Set frame layout
        frame.setLayout(new FlowLayout());

        // Create a Label
        Label label = new Label("Enter your name:");

        // Create a TextField
        TextField textField = new TextField(20);

        // Create a Button
        Button button = new Button("Submit");

        // Create a Label for displaying the result
        Label resultLabel = new Label();

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                resultLabel.setText("Hello, " + name + "!");
            }
        });

        // Set frame properties
        frame.setSize(300, 200); // Set size of the frame
        frame.setVisible(true); // Make the frame visible

        // Add a WindowListener to close the window
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
