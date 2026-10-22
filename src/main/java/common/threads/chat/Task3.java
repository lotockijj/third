package common.threads.chat;

import java.util.List;
import java.util.concurrent.*;

public class Task3 {
    public void runAll(List<Runnable> tasks) throws Exception {
        ExecutorService executor = Executors.newCachedThreadPool();
        try {
            // Submit all tasks and collect Futures
            List<? extends Future<?>> futures = tasks.stream()
                    .map(executor::submit)
                    .toList();

            // This will hold the first exception encountered (if any)
            Throwable firstException = null;

            // Wait for each task, in order (order doesn't matter for correctness)
            for (Future<?> f : futures) {
                try {
                    f.get(); // blocks until this task completes
                } catch (ExecutionException e) {
                    // Unchecked exception thrown inside the task
                    firstException = e.getCause();
                    break; // stop waiting, we need to cancel others
                } catch (InterruptedException e) {
                    // Current thread was interrupted
                    Thread.currentThread().interrupt(); // restore interrupt status
                    firstException = e;
                    break;
                }
            }

            // If an exception occurred, cancel all remaining tasks
            if (firstException != null) {
                for (Future<?> f : futures) {
                    if (!f.isDone()) {
                        f.cancel(true); // interrupt if running
                    }
                }
                // Throw the original exception
                if (firstException instanceof RuntimeException) {
                    throw (RuntimeException) firstException;
                } else if (firstException instanceof Error) {
                    throw (Error) firstException;
                } else {
                    // Wrap checked exceptions (should not happen per problem statement)
                    throw new RuntimeException(firstException);
                }
            }
        } finally {
            // Interrupt any still-running tasks and shut down
            executor.shutdownNow();
        }
    }
}
