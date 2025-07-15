package common.threads;

public class JoinExample {

    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            System.out.println("Worker thread started...");
            try {
                Thread.sleep(2000); // Simulate work
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Worker thread finished.");
        });

        worker.start();

        try {
            // main thread waits for worker thread to complete
            worker.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread resumes after worker is done.");
    }
}
