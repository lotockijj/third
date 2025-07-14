package common.threads;

import java.util.Date;

public class MyRunable implements Runnable{
    @Override

    public void run() {
        Date date = new Date();
        System.out.printf("MyRunable: %s, %s \n", this.hashCode(), date.getTime());
    }
}
