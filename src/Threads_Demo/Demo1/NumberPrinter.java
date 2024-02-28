package Threads_Demo.Demo1;

public class NumberPrinter implements Runnable {
    private int numToPrint;
    public NumberPrinter(int numToPrint) {
        this.numToPrint = numToPrint;
    }
    public void run() {
        System.out.println(numToPrint +" printed by thread = " + Thread.currentThread().getName());
    }
}
