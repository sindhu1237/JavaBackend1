package Threads_Intro.Demo1;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World from = "+ Thread.currentThread().getName());
        doSomething();
        System.out.println("Hello World from = "+ Thread.currentThread().getName());
    }
    public static void doSomething(){
        System.out.println("Hello World from a function = "+ Thread.currentThread().getName());
    }
}
