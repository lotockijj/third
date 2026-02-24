package common.threads;

import java.util.concurrent.atomic.AtomicBoolean;

public class BusyWaiting {

    public static void main(String[] args) {
        AtomicBoolean shouldCount = new AtomicBoolean(false);
        final Object monitor = new Object();
        Thread thread = new Thread(() -> {
            synchronized (monitor) {
                simulateThreadWork();
                shouldCount.set(true);
                monitor.notify();
            }
        });
        thread.start();
        int count = 0;
        synchronized (monitor) {
            while (!shouldCount.get()) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                count++;
            }
        }
        System.out.println(count);
    }

    private static void simulateThreadWork() {
        int m = 2;
        int sum = 0;
        for (int i = 0; i < m*m; i++) {
            sum += i;
        }
        if(sum > 10){
            System.out.println(sum);
        }
    }
}
