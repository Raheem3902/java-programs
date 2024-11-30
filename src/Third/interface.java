package Third;


    // Interface
    interface Animal {
        // Abstract method (no implementation)
        void sound();

        // Default method (introduced in Java 8)
        default void sleep() {
            System.out.println("This animal is sleeping");
        }
    }

    // Abstract Class
    abstract class Mammal {
        // Concrete method
        void eat() {
            System.out.println("This mammal is eating");
        }

        // Abstract method (no implementation)
        abstract void move();
    }

    // Concrete Class implementing Interface and extending Abstract Class
    class Dog extends Mammal implements Animal {
        // Implementing abstract method from Animal interface
        public void sound() {
            System.out.println("Dog barks");
        }

        // Implementing abstract method from Mammal class
        public void move() {
            System.out.println("Dog runs");
        }
    }


         class Main {
            public static void main(String[] args) {
                Dog dog = new Dog();

                // Calling methods from both interface and abstract class
                dog.sound();      // Method from Animal interface
                dog.sleep();      // Default method from Animal interface
                dog.eat();        // Method from Mammal abstract class
                dog.move();       // Method from Mammal abstract class
            }
        }



