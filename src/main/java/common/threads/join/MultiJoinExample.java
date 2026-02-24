package common.threads.join;

public class MultiJoinExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 starting...");
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 done.");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 starting...");
            try {
                Thread.sleep(1500); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 done.");
        });

        t1.start();
        t2.start();

        try {
            t1.join(); // Wait for t1 to finish
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread continues after both threads are done.");
    }
}
