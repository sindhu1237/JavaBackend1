package ProblemOfSynchronization.synchronizedMethod;

public class Counter {
    private int val = 0;

    public Counter (int val) {
        this.val += val;
    }
    public synchronized void incVal (int offset) {
        this.val += offset;
    }

    public synchronized int getVal() {
        return val;
    }
}
