package Third;
// Demonstrating threading in Java
// Simple Threading Example
class SimpleThreadingExample {

    // Thread creation by extending the Thread class
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread from MyThread class is running.");
        }
    }

    // Thread creation by implementing the Runnable interface
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread from MyRunnable class is running.");
        }
    }

    public static void main(String[] args) {
        // Using Thread class
        MyThread thread1 = new MyThread();

        // Using Runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);

        // Start the threads
        thread1.start();
        thread2.start();

        // Main thread execution
        System.out.println("Main thread is running.");
    }
}

//This program demonstrates the basic structure of threading with minimal complexity.
//You can see how to use both Thread class and Runnable interface in the same program.
//Threads may execute in any order, depending on the JVM's thread scheduler.


