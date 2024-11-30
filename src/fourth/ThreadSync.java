package fourth;

// Class to demonstrate Thread Synchronization


    // Shared resource class
     class Table {
        // Synchronized method to print a multiplication table
        synchronized void printTable(int n) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
                try {
                    Thread.sleep(500); // Simulating delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    // Thread class that works on the shared Table resource
    class MyThread extends Thread {
        Table table;
        int number;

        MyThread(Table table, int number) {
            this.table = table;
            this.number = number;
        }

        @Override
        public void run() {
            table.printTable(number); // Accessing the synchronized method
        }
    }

    // Main method
     class ThreadSynchroniation {
    public static void main(String[] args) {
        // Shared resource
        Table sharedTable = new Table();

        // Creating multiple threads that share the same resource
        MyThread t1 = new MyThread(sharedTable, 5);
        MyThread t2 = new MyThread(sharedTable, 7);

        // Starting threads
        t1.start();
        t2.start();
    }
}

//     Key Points:
//     Synchronization ensures thread safety when accessing shared resources.
//     Without synchronized, threads could interleave, causing inconsistent results (e.g., mixed outputs of the two tables).
//     You can also synchronize blocks (synchronized(this) { ... }) if fine-grained control is needed.

