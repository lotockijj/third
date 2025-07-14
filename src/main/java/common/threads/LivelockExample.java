package common.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class LivelockExample {
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        LivelockExample livelockExample = new LivelockExample();
        new Thread(livelockExample::operation1, "T1").start();
        new Thread(livelockExample::operation2, "T2").start();
    }

    public void operation1(){
        while(true){
            lock1.tryLock();
            System.out.println("lock1 acquired, trying to acquire lock2.");
            sleepWell();

            if(lock2.tryLock()){
                System.out.println("lock2 acquired.");
            } else {
                System.out.println("cannot acquire lock2, releasing lock1.");
                lock1.unlock();
                continue;
            }
            System.out.println("executing first operation.");
            break;
        }
        lock2.unlock();
        lock1.unlock();
    }

    public void operation2() {
        while (true) {
            lock2.tryLock();
            System.out.println("lock2 acquired, trying to acquire lock1.");
            sleepWell();

            if (lock1.tryLock()) {
                System.out.println("lock1 acquired.");
            } else {
                System.out.println("cannot acquire lock1, releasing lock2.");
                lock2.unlock();
                continue;
            }

            System.out.println("executing second operation.");
            break;
        }
        lock1.unlock();
        lock2.unlock();
    }

    public void sleepWell(){
        try {
            sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
lock1 acquired, trying to acquire lock2. 1
lock2 acquired, trying to acquire lock1. 2
cannot acquire lock2, releasing lock1.   3
lock1 acquired, trying to acquire lock2. 1
cannot acquire lock1, releasing lock2.   4
lock2 acquired, trying to acquire lock1. 2
cannot acquire lock1, releasing lock2.   4
lock2 acquired, trying to acquire lock1. 2
cannot acquire lock2, releasing lock1.   3
lock1 acquired, trying to acquire lock2. 1
cannot acquire lock1, releasing lock2.   4
***
 */
