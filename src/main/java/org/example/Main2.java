package org.example;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main2 {

    public static void main(String[] args)
            throws ExecutionException, InterruptedException, TimeoutException {
        int[] arr = {1, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //System.out.print(i + " " + j + ",  ");
            }
            //System.out.println();
        }

        Runnable runnableTask = () -> {
            try{
                System.out.println("Inside runnable task");
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Callable callable = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution";
        };

        List<Callable<String>> callableTasks = List.of(callable, callable, callable);

        ExecutorService executorService =
                new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<Runnable>());

        executorService.execute(runnableTask);

        Future<String> submit = executorService.submit(callable);
        //System.out.println(submit.get(200, TimeUnit.MILLISECONDS));
        boolean done = submit.isDone();
        System.out.println("isDone() - " + done);
        System.out.println("submit.isCancelled() = " + submit.isCancelled());
        submit.cancel(true);
        System.out.println("submit.cancel(true) = " + submit.isCancelled());
        List<Future<String>> futures = executorService.invokeAll(callableTasks);
        futures.forEach(e -> {
            try {
                System.out.println(e.get());
            } catch (InterruptedException | ExecutionException ex) {
                throw new RuntimeException(ex);
            }
        });

        System.out.println("!" + executorService.invokeAny(callableTasks));
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                List<Runnable> notExecutedTasks = executorService.shutdownNow();
                System.out.println(notExecutedTasks);
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        ScheduledExecutorService executorService1 = Executors
                .newSingleThreadScheduledExecutor();


        Callable callable1 = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution";
        };
        Future<String> resultFuture =
                executorService1.schedule(callable1, 1, TimeUnit.SECONDS);

        executorService1.shutdown();

        //create and start threads
        Thread thread = new Thread();
    }
}
