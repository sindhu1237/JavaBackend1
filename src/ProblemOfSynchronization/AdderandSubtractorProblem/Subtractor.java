package ProblemOfSynchronization.AdderandSubtractorProblem;

public class Subtractor implements Runnable {
    Counter c2;
    Subtractor(Counter c) {
        this.c2 = c;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            c2.val -= i;
        }
//        c2.val--;
    }
}
