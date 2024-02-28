package Threads_Demo.Demo2;

public class NumberPrinter implements Runnable {
    private int numToPrint = 0;

//    public int getNumToPrint() {
//        return numToPrint;
//    }
//
//    public void setNumToPrint(int numToPrint) {
//        this.numToPrint = numToPrint;
//    }

    public void run() {
        System.out.println(numToPrint +" printed by thread = " + Thread.currentThread().getName());
        numToPrint++;
    }
}
