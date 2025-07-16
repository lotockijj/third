package common.threads.producer;

public class Consumer implements Runnable {
    private final DataQueue dataQueue;
    private boolean running = false;

    public Consumer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        running = true;
        consume();
    }

    private void consume() {
        while (running) {
            if (dataQueue.isEmpty()) {
                try {
                    dataQueue.waitIsNotEmpty();
                } catch (InterruptedException e) {
                    System.out.println("Error while waiting to Consume messages.");
                    break;
                }
            }
            if (!running) {
                break;
            }
            Message message = dataQueue.remove();
            useMessage(message);
        }
        System.out.println("Consumer stopped");
    }

    private void useMessage(Message message) {
        if(message.getId() == 99){
            stop();
        }
        System.out.println(message);
    }

    public void stop(){
        running = false;
        dataQueue.notifyIsNotEmpty();
    }
}
