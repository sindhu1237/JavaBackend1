package ProblemOfSynchronization.synchronizedBlock;

import java.util.concurrent.locks.Lock;
public class Adder implements Runnable {
    Counter c1;
//    Lock lock;
    Adder(Counter c) {
        this.c1 = c;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            synchronized (c1) {
                c1.val += i;
            }
        }
    }
}
