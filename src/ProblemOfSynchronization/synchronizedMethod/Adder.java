package ProblemOfSynchronization.synchronizedMethod;

public class Adder implements Runnable {
    Counter c1;
//    Lock lock;
    Adder(Counter c) {
        this.c1 = c;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            c1.incVal(i);
        }
    }
}
