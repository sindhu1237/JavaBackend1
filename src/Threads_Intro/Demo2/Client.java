package Threads_Intro.Demo2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello from World = " + Thread.currentThread().getName());
        int x = 10;
        int y = 20;
        int z = x+y;
        ThreadCreation tc = new ThreadCreation();
//         tc.run(); // will run on same main thread
        Thread t = new Thread(tc);
        t.start();
//        ThreadCreation tc1 = new ThreadCreation();
//        Thread t1 = new Thread(tc1);
//        t1.start();
        System.out.println("Bye from World  = " + Thread.currentThread().getName());
    }
}
