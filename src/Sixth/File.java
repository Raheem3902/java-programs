package Sixth;

import java.io.File;
import java.util.Scanner;

 class FileInformation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name (with path if not in the current directory):");
        String fileName = scanner.nextLine(); // Read the file name from the user

        // Create a File object for the specified file name
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists: Yes");

            // Check if the file is readable
            System.out.println("File is readable: " + (file.canRead() ? "Yes" : "No"));

            // Check if the file is writable
            System.out.println("File is writable: " + (file.canWrite() ? "Yes" : "No"));

            // Check the type of file (directory or regular file)
            if (file.isDirectory()) {
                System.out.println("Type of file: Directory");
            } else if (file.isFile()) {
                System.out.println("Type of file: Regular file");
            }

            // Get the length of the file in bytes
            System.out.println("Length of the file: " + file.length() + " bytes");
        } else {
            System.out.println("The file does not exist.");
        }

        // Close the scanner
        scanner.close();
    }
}
