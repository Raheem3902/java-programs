package Third;

import java.util.Scanner;

 class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = divideNumbers(num1, num2);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Closing the scanner.");
            scanner.close(); // Ensure the scanner is closed to prevent resource leaks
        }
    }

    // Method to perform division
    static int divideNumbers(int a, int b) throws ArithmeticException {
        return a / b; // May throw ArithmeticException if b is 0
    }
}


// Error Handling: Exception handling provides a mechanism to respond to runtime errors without crashing the program.
// Multiple catch Blocks: Enables handling different types of exceptions in a granular way.
//         finally Block: Ensures cleanup actions (like resource closing) are always executed.
