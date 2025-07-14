package common.threads;

import java.util.Date;

public class MyThread extends Thread {

    @Override
    public void run() {
        Date date = new Date();
        System.out.printf("MyThread: %s, %s \n", this.hashCode(), date.getTime());
    }

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyRunable myRunnable1 = new MyRunable();
        MyThread myThread2 = new MyThread();
        MyRunable myRunnable2 = new MyRunable();

        myThread1.start();
        new Thread(myRunnable1).start();
        myThread2.start();
        new Thread(myRunnable2).start();

        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable);
        thread.setDaemon(true);
        System.out.println("Demon thread is going to be start: ");
        thread.start();
    }
}
