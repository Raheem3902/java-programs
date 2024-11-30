package Sixth;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

 class SimpleIOStreamsExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {

            int data;
            // Read and write data byte by byte
            while ((data = fis.read()) != -1) {
                fos.write(data); // Write to the output file
            }

            System.out.println("File copy completed successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

// Simplified Try-With-Resources:
//
// Uses try-with-resources to automatically close FileInputStream and FileOutputStream.
// No need for a finally block.
// How It Works:
//
// Reads data from input.txt using FileInputStream.
// Writes the same data to output.txt using FileOutputStream.
// Error Handling:
//
// Handles exceptions with a single catch block for simplicity.
