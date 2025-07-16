package common.threads.producer;

public class Main {
    private static final int MAX_QUEUE_CAPACITY = 4;

    public static void main(String[] args) {
        DataQueue dataQueue = new DataQueue(MAX_QUEUE_CAPACITY);
        //or use BlockingQueue<Double> blockingQueue = new LinkedBlockingDeque<>(5);
        Producer producer = new Producer(dataQueue);
        Thread producerThread = new Thread(producer);
        Consumer consumer = new Consumer(dataQueue);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        producer.stop();
        consumer.stop();
    }
}
