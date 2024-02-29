package Threads_Demo.ExecutableService.Demo3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hi from "+ Thread.currentThread().getName());
        ExecutorService es = Executors.newFixedThreadPool(10); //c
        for(int i = 1; i <= 100; i++) {
            NumberPrinter np =new NumberPrinter(i); // client is only making the jobs and giving it to executor service
//            The ExecutorService is responsible for creating threads and assigning jobs to them.
//            It determines the number of threads to create based on the number of jobs.
            es.submit(np);
//            Thread t = new Thread(np);
//            t.start();
        }
        System.out.println("Bye from "+ Thread.currentThread().getName());
        es.shutdown();
    }
}
