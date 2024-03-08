package ProblemOfSynchronization.Semaphores;

import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private String name;
    private Semaphore ps;
    private Semaphore cs;
    private Queue<Object> store;
    private HashSet<String> peopleInsideTheStore;

    public Consumer(String name, Semaphore ps, Semaphore cs, Queue<Object> store, HashSet<String> peopleInsideTheStore) {
        this.name = name;
        this.ps = ps;
        this.cs = cs;
        this.store = store;
        this.peopleInsideTheStore = peopleInsideTheStore;
    }

    public Consumer(String name, Semaphore ps, Semaphore cs, Queue<Object> store) {
        this.name = name;
        this.ps = ps;
        this.cs = cs;
        this.store = store;
    }

    @Override
    public void run() {
        try {
            cs.acquire();
//            peopleInsideTheStore.add(name);
//            System.out.println("people inside the store -" + peopleInsideTheStore+ ". Store contents = " + store.size() );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.poll();
        System.out.println(name + " removed a shirt. Store size is now " + store.size());
//        peopleInsideTheStore.remove(name);
        ps.release();
    }
}
