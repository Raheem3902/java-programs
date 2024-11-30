package First;

// Class to illustrate types of constructors
public class constructor {

    // Student class defined as a top-level class (or static nested class)
    static class Student {
        // Attributes of the Student class
        String name;
        int rollNumber;

        // 1. Default Constructor
        Student() {
            name = "Unknown";
            rollNumber = 0;
            System.out.println("Default Constructor called!");
        }

        // 2. Parameterized Constructor
        Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
            System.out.println("Parameterized Constructor called!");
        }

        // 3. Copy Constructor
        Student(Student other) {
            this.name = other.name;
            this.rollNumber = other.rollNumber;
            System.out.println("Copy Constructor called!");
        }

        // Method to display student details
        void displayDetails() {
            System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Using Default Constructor
        Student student1 = new Student();
        student1.displayDetails();

        // Using Parameterized Constructor
        Student student2 = new Student("Alice", 101);
        student2.displayDetails();

        // Using Copy Constructor
        Student student3 = new Student(student2);
        student3.displayDetails();
    }
}


//Types of Constructors:
//  1) Default Constructor:
//Initializes the name as "Unknown" and rollNumber as 0 when no values are passed during object creation.
//This constructor is called in the student1 object (Student student1 = new Student();).
//  2)Parameterized Constructor:
//Takes two arguments (name and rollNumber) and initializes the object with specific values.
//This constructor is used for student2 (Student student2 = new Student("Alice", 101);).
//  3)Copy Constructor:
//Creates a new Student object by copying the name and rollNumber of another Student object.
//This constructor is invoked for student3 by passing student2 (Student student3 = new Student(student2);).