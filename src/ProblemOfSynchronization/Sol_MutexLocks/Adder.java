package ProblemOfSynchronization.Sol_MutexLocks;
import java.util.concurrent.locks.Lock;
public class Adder implements Runnable {
    Counter c1;
    Lock lock;
    Adder(Counter c, Lock lock) {
        this.c1 = c;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for(int i = 1; i <= 10000; i++) {
            c1.val += i;
        }
        lock.unlock();
//        c1.val++;
    }
}
