package First;



    // Define the Employee class
    class Employee {
        // Attributes of the Employee class
        String name;
        int id;
        String department;
        double salary;

        // Constructor to initialize an Employee object
        Employee(String name, int id, String department, double salary) {
            this.name = name;
            this.id = id;
            this.department = department;
            this.salary = salary;
        }

        // Method to display employee details
        void displayDetails() {
            System.out.println("Employee Details:");
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Department: " + department);
            System.out.println("Salary: $" + salary);
        }

        // Method to simulate work
        void work() {
            System.out.println(name + " is working in the " + department + " department.");
        }
    }

    // Main class to execute the program
    public class objects{
        public static void main(String[] args) {
            // Create an object of the Employee class
            Employee engineer = new Employee("Alice", 101, "Engineering", 75000.00);

            // Call methods on the object
            engineer.displayDetails(); // Display employee details
            engineer.work(); // Simulate work
        }
    }

//   Package Declaration: The program starts with package First; to group related classes together, enabling organized code management.

//Employee Class: Acts as a blueprint with attributes (name, id, department, salary), a constructor for initialization, and methods (displayDetails and work) for behavior.

//Object Creation: The main method in the objects class creates an instance (engineer) of the Employee class using the constructor.

//Method Usage: The methods displayDetails() and work() are called on the engineer object to display details and simulate work activity.


