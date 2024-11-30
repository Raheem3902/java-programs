package fifth;

import java.util.Scanner;
import java.util.StringTokenizer;

class IntegerSumUsingStringTokenizer {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of integers separated by spaces:");

        // Read a line of input from the user
        String inputLine = scanner.nextLine();

        // Create a StringTokenizer to parse integers from the input
        StringTokenizer tokenizer = new StringTokenizer(inputLine);

        int sum = 0; // Variable to store the sum of integers

        System.out.println("The integers are:");
        // Process each token (integer) from the StringTokenizer
        while (tokenizer.hasMoreTokens()) {
            // Parse the next token as an integer
            int number = Integer.parseInt(tokenizer.nextToken());
            System.out.println(number); // Display the integer
            sum += number; // Add the integer to the sum
        }

        // Display the total sum
        System.out.println("The sum of all integers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}


//Key points:
//
//Reading Input:
//The program uses a Scanner object to read a line of integers from the user
//
//StringTokenizer:
//The StringTokenizer splits the input string into tokens (separated by spaces by default).
//Each token is treated as a number and converted into an integer using Integer.parseInt()