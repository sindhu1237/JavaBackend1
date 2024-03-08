package ProblemOfSynchronization.Semaphores;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new LinkedList<>();
//        HashSet<String> peopleInsideTheStore = new HashSet<>();
        int cap = 5;
        Semaphore ps = new Semaphore(5);
        Semaphore cs = new Semaphore(0);
        for(int i = 1; i <= 100; i++) {
//            Producer p = new Producer("p"+i, ps, cs, store, peopleInsideTheStore);
            Producer p = new Producer("p" + i, ps, cs, store);
            Thread tforp = new Thread(p);
            tforp.start();

//            Consumer c = new Consumer("c"+i, ps, cs, store, peopleInsideTheStore);
            Consumer c = new Consumer("c" + i, ps, cs, store);
            Thread tforc = new Thread(c);
            tforc.start();
        }
    }
}
