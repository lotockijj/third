package common.threads.producer;

public class Producer implements Runnable {
    private final DataQueue dataQueue;
    private boolean running = false;
    private int count = 1;
    private double countD = 1.0;

    public Producer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        running = true;
        produce();
    }

    public void produce() {
        while (running) {
            if (dataQueue.isFull()) {
                try {
                    dataQueue.waitIsNotFull();
                } catch (InterruptedException e) {
                    System.out.println("Error while waiting to Produce messages.");
                    break;
                }
            }
            if (!running) {
                break;
            }
            dataQueue.add(generateMessage());
        }
        System.out.println("Producer Stopped");
    }

    private Message generateMessage() {
        countD += 1;
        if(count == 100){
            stop();
        }
        return new Message(++count, countD);
    }

    public void stop() {
        running = false;
        dataQueue.notifyIsNotFull();
    }
}
