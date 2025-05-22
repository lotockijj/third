package common.threads;

public class InterruptExample {

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(new WorkerTask());
        worker.start();

        // Let the worker run for 2 seconds
        Thread.sleep(2000);

        // Politely ask the worker thread to stop
        System.out.println("Main: Interrupting worker thread...");
        worker.interrupt();

        // Wait for the worker thread to finish
        worker.join();
        System.out.println("Main: Worker thread has finished.");
    }

    static class WorkerTask implements Runnable {
        @Override
        public void run() {
            while (true) {
                // Check if thread was interrupted
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Worker: Interrupted! Cleaning up...");
                    break; // Exit the loop and end the thread
                }

                try {
                    // Simulate doing some work
                    System.out.println("Worker: Working...");
                    Thread.sleep(500); // Blocking call that can throw InterruptedException
                } catch (InterruptedException e) {
                    System.out.println("Worker: Interrupted during sleep.");
                    Thread.currentThread().interrupt(); // Re-set the interrupt flag
                    break;
                }
            }

            System.out.println("Worker: Finished.");
        }
    }
}
