package common.threads.producer;

import java.util.LinkedList;
import java.util.Queue;

public class DataQueue {
    private final Queue<Message> queue = new LinkedList<>();
    private final int maxSize;
    private final Object IS_NOT_FULL = new Object();
    private final Object IS_NOT_EMPTY = new Object();

    public DataQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    public void waitIsNotFull() throws InterruptedException {
        synchronized (IS_NOT_FULL) {
            IS_NOT_FULL.wait();
        }
    }

    public void notifyIsNotFull() {
        synchronized (IS_NOT_FULL) {
            IS_NOT_FULL.notify();
        }
    }

    public void waitIsNotEmpty() throws InterruptedException {
        synchronized (IS_NOT_EMPTY) {
            IS_NOT_EMPTY.wait();
        }
    }

    public void notifyIsNotEmpty() {
        synchronized (IS_NOT_EMPTY) {
            IS_NOT_EMPTY.notify();
        }
    }

    public void add(Message message) {
        queue.add(message);
        notifyIsNotEmpty();
    }

    public Message remove() {
        Message mess = queue.poll();
        notifyIsNotFull();
        return mess;
    }

    public boolean isFull() {
        return queue.size() == maxSize;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
