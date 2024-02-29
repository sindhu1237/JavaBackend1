package Threads_Demo.Callable.Demo1;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        GreetingsCreator gc = new GreetingsCreator();
        ExecutorService es = Executors.newFixedThreadPool(10);
        Future<String> promiseOfaString = es.submit(gc);

        // any work not related to greeting
        System.out.println("A hello that is not related to the greeting");
        int mult = 2 * 5;
        System.out.println(mult);

        // take greeting
        String greeting = promiseOfaString.get(); // A potentially blocking statement

        System.out.println(greeting);

        es.shutdown();
    }
}
