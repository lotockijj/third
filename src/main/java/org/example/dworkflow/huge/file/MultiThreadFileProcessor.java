package org.example.dworkflow.huge.file;

import java.io.*;
import java.util.concurrent.*;

public class MultiThreadFileProcessor {
    private static final int THREAD_COUNT = 10;
    private static final int QUEUE_CAPACITY = 1000; // limit to avoid memory issues
    private static final String FILE_PATH = "huge.txt";

    public static void main(String[] args) throws Exception {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        // Start consumer threads
        for (int i = 0; i < THREAD_COUNT; i++) {
            executor.submit(() -> {
                try {
                    while (true) {
                        String line = queue.take(); // waits if queue is empty
                        if (line.equals("__EOF__")) break; // end signal
                        processLine(line);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Producer thread: reads file and puts lines into the queue
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                queue.put(line); // waits if queue is full
            }
        }

        // Send stop signal to consumers
        for (int i = 0; i < THREAD_COUNT; i++) {
            queue.put("__EOF__");
        }

        // Shutdown pool
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }

    private static void processLine(String line) {
        // Simulate processing
        System.out.println(Thread.currentThread().getName() + " processed: " + line);
    }
}

