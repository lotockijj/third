package common.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelTaskProcessor {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int n = 10;
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Future> futures = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int num = i;
            Callable<Integer> task = () -> {
                //Simulate work
                Thread.sleep(100);
                return num * num;
            };
            futures.add(executor.submit(task));
        }
        //Combine results
        List<Integer> results = new ArrayList<>();
        for (Future<Integer> future : futures) {
            results.add(future.get());
        }
        executor.shutdown();
        System.out.println(results);
    }
}
