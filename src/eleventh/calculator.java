package eleventh;

import java.awt.*;
import java.awt.event.*;

 class Calculator extends Frame implements ActionListener {

    // Define components
    TextField resultField;
    Button[] numberButtons;
    Button addButton, subButton, mulButton, divButton, modButton, equalsButton, clearButton;
    String currentText = "";
    double num1, num2, result;
    char operator;

    public Calculator() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(400, 500);
        setLayout(new GridLayout(5, 4, 10, 10));

        // Initialize the result display field
        resultField = new TextField();
        resultField.setEditable(false);
        add(resultField);

        // Initialize buttons
        numberButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        modButton = new Button("%");
        equalsButton = new Button("=");
        clearButton = new Button("C");

        // Add listeners to the buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        modButton.addActionListener(this);
        equalsButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add buttons to the frame
        add(numberButtons[1]);
        add(numberButtons[2]);
        add(numberButtons[3]);
        add(addButton);

        add(numberButtons[4]);
        add(numberButtons[5]);
        add(numberButtons[6]);
        add(subButton);

        add(numberButtons[7]);
        add(numberButtons[8]);
        add(numberButtons[9]);
        add(mulButton);

        add(clearButton);
        add(numberButtons[0]);
        add(equalsButton);
        add(divButton);

        // Set window behavior
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Method to handle button clicks
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Handle number buttons
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            currentText += command;
            resultField.setText(currentText);
        }
        // Handle operation buttons
        else if (command.equals("+")) {
            num1 = Double.parseDouble(currentText);
            operator = '+';
            currentText = "";
        } else if (command.equals("-")) {
            num1 = Double.parseDouble(currentText);
            operator = '-';
            currentText = "";
        } else if (command.equals("*")) {
            num1 = Double.parseDouble(currentText);
            operator = '*';
            currentText = "";
        } else if (command.equals("/")) {
            num1 = Double.parseDouble(currentText);
            operator = '/';
            currentText = "";
        } else if (command.equals("%")) {
            num1 = Double.parseDouble(currentText);
            operator = '%';
            currentText = "";
        }
        // Handle equals button
        else if (command.equals("=")) {
            num2 = Double.parseDouble(currentText);
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultField.setText("Error");
                        return;
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    break;
            }
            currentText = String.valueOf(result);
            resultField.setText(currentText);
        }
        // Handle clear button
        else if (command.equals("C")) {
            currentText = "";
            resultField.setText(currentText);
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new Calculator();  // Create and display the calculator
    }
}

