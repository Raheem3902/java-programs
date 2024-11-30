package Second;



    // Parent class (Superclass)
    class Animal {
        // Method in the parent class
        void sound() {
            System.out.println("Animals make a sound");
        }
    }

    // Child class (Subclass) overriding the method from Animal class
     class Dog extends Animal {
        // Overriding the method of Animal class
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

     class Cat extends Animal {
        // Overriding the method of Animal class
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    // Main class to execute the program
    public class MethodOverriding {
    public static void main(String[] args) {
        // Creating objects of the Animal class and its subclasses
        Animal animal = new Animal(); // Parent class object
        Animal dog = new Dog(); // Child class object (Dog)
        Animal cat = new Cat(); // Child class object (Cat)

        // Calling the sound() method for each object
        System.out.println("Calling sound() method on Animal object:");
        animal.sound(); // Calls the method from Animal class

        System.out.println("\nCalling sound() method on Dog object:");
        dog.sound(); // Calls the overridden method from Dog class

        System.out.println("\nCalling sound() method on Cat object:");
        cat.sound(); // Calls the overridden method from Cat class
    }
}
