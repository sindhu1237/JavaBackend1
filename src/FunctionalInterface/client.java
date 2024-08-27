package FunctionalInterface;

import ProblemOfSynchronization.Semaphores.Consumer;

import java.util.LinkedList;
import java.util.Queue;

public class client {
    public static void main(String[] args) {
        DemoInterface way1 = new DemoImplementation();
        way1.fun();
        DemoInterface way2 = new DemoInterface() {
            @Override
            public void fun() {
                System.out.println("anonymous class way");
            }
        };
        way2.fun();
    }
}
