package Second;

public class Inheritance {

    // Base class (Parent class)
    static class Vehicle {
        // Attribute of the Vehicle class
        String brand;

        // Constructor of Vehicle class
        Vehicle(String brand) {
            this.brand = brand;
        }

        // Method of Vehicle class
        void display() {
            System.out.println("Vehicle Brand: " + brand);
        }
    }

    // Single Level Inheritance
    // Derived class (Child class) inherits from Vehicle
    static class Car extends Vehicle {
        // Attribute of Car class
        int doors;

        // Constructor of Car class
        Car(String brand, int doors) {
            // Calling the parent class (Vehicle) constructor
            super(brand);
            this.doors = doors;
        }

        // Method of Car class
        void displayDetails() {
            display(); // Calling parent class method
            System.out.println("Number of doors: " + doors);
        }
    }

    // Multi-Level Inheritance
    // Derived class (Child class) inherits from Car, which already inherits from Vehicle
    static class SportsCar extends Car {
        // Attribute of SportsCar class
        int topSpeed;

        // Constructor of SportsCar class
        SportsCar(String brand, int doors, int topSpeed) {
            // Calling the parent class (Car) constructor
            super(brand, doors);
            this.topSpeed = topSpeed;
        }

        // Method of SportsCar class
        void displaySportsCarDetails() {
            displayDetails(); // Calling Car class method
            System.out.println("Top speed: " + topSpeed + " km/h");
        }
    }

    // Main class to execute the program
    public static void main(String[] args) {
        // Single Level Inheritance: Creating object of Car class
        System.out.println("Single Level Inheritance:");
        Car myCar = new Car("Toyota", 4);
        myCar.displayDetails(); // Calling Car's method

        // Multi Level Inheritance: Creating object of SportsCar class
        System.out.println("\nMulti Level Inheritance:");
        SportsCar mySportsCar = new SportsCar("Ferrari", 2, 350);
        mySportsCar.displaySportsCarDetails(); // Calling SportsCar's method
    }
}


//Inheritance Structure: The program demonstrates single-level inheritance (Car inherits from Vehicle) and multi-level inheritance (SportsCar inherits from Car, which inherits from Vehicle).
//Constructor Chaining: Each class has a constructor that calls the constructor of its parent class using super() to ensure proper initialization.
//Reusability of Methods: The child classes (Car and SportsCar) reuse the display() method from the Vehicle class by calling it within their own methods.
//Method Calls: Inherited methods (display() from Vehicle) are called in child classes (Car's displayDetails() and SportsCar's displaySportsCarDetails()).
//Object Creation: The main() method demonstrates object creation for Car and SportsCar, showcasing the constructor behavior and method execution.

