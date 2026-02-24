package common.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SynchronizedCollectionsExample {

    public static void main(String[] args) {
        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
        Thread thread1 = new Thread(() -> syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Thread thread2 = new Thread(() -> syncCollection.addAll(Arrays.asList(7, 8, 9, 10, 11, 12)));
        thread2.start();
        thread1.start();
        syncCollection.forEach(System.out::println);
        System.out.println(Integer.signum(-2));
    }
}
