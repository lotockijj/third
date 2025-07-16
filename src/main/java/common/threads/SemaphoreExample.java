package common.threads;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static int COUNTER = 0;

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire(); // Wait if limit reached
                    System.out.println("Work simulation: COUNT=" + COUNTER++);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    semaphore.release(); // Release permit
                }
            }).start();
        }
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processors: " + i);
    }
}
