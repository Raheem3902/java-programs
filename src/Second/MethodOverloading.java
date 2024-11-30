package Second;

 class MethodOverloadingExample {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();

        // Calling the method with two integers
        System.out.println("Sum of 5 and 10: " + obj.add(5, 10));

        // Calling the overloaded method with three integers
        System.out.println("Sum of 1, 2, and 3: " + obj.add(1, 2, 3));

        // Calling the overloaded method with two doubles
        System.out.println("Sum of 3.5 and 4.5: " + obj.add(3.5, 4.5));

        // Calling the overloaded method with an integer and a double
        System.out.println("Sum of 5 and 3.5: " + obj.add(5, 3.5));
    }
}
