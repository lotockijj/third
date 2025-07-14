package common.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        ScheduledFuture<?> future = executor.scheduleAtFixedRate(() ->{
            System.out.println("Hello world!");
            countDownLatch.countDown();
        }, 500, 100, TimeUnit.MILLISECONDS);
        countDownLatch.await(1000, TimeUnit.MILLISECONDS);
        future.cancel(true);
        executor.shutdown();
    }
}
