package Threads_Intro.Demo2;

/*
 1. Implement an interface called Runnable
 */
public class ThreadCreation implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from a new class running on a separate thread = " + Thread.currentThread().getName());
        int x = 10;
        int y = 20;
        int z = x * y;
        doSomething();
    }
    public void doSomething() {
        System.out.println("Hello from a new class, doSomething function, running " +
                "on a separate thread = " + Thread.currentThread().getName());
    }

}
