package common.threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinSumExample {

    static class SumTask extends RecursiveTask<Long> {
        private static final int THRESHOLD = 10_000; // Process sequentially if below this
        private final long[] array;
        private final int start, end;

        SumTask(long[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            if (end - start <= THRESHOLD) {
                // Small enough - compute directly
                long sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else {
                // Split task in half
                int mid = (start + end) / 2;
                SumTask left = new SumTask(array, start, mid);
                SumTask right = new SumTask(array, mid, end);

                left.fork(); // Queue the left task
                long rightResult = right.compute(); // Compute right immediately
                long leftResult = left.join(); // Wait for left result

                return leftResult + rightResult;
            }
        }
    }

    public static void main(String[] args) {
        // Create a large array
        long[] array = new long[100_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // 1..100000
        }

        // Create ForkJoinPool and task
        ForkJoinPool pool = new ForkJoinPool();
        long sum = pool.invoke(new SumTask(array, 0, array.length));

        System.out.println("Sum: " + sum); // Should be 5000050000
    }
}