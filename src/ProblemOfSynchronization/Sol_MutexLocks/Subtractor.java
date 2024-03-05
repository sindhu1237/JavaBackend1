package ProblemOfSynchronization.Sol_MutexLocks;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    Counter c2;
    Lock lock;
    Subtractor(Counter c, Lock lock) {
        this.c2 = c;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for(int i = 1; i <= 10000; i++) {
            c2.val -= i;
        }
        lock.unlock();
//        c2.val--;
    }
}
