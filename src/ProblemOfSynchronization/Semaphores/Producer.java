package ProblemOfSynchronization.Semaphores;

import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private String name;
    private Semaphore ps;
    private Semaphore cs;
    private Queue<Object> store;
    private HashSet<String> peopleInsideTheStore;

    public Producer(String name, Semaphore ps, Semaphore cs, Queue<Object> store) {
        this.name = name;
        this.ps = ps;
        this.cs = cs;
        this.store = store;
    }

    public Producer(String name, Semaphore ps, Semaphore cs, Queue<Object> store, HashSet<String> peopleInsideTheStore) {
        this.name = name;
        this.ps = ps;
        this.cs = cs;
        this.store = store;
        this.peopleInsideTheStore = peopleInsideTheStore;
    }

    @Override
    public void run() {
        try {
            ps.acquire();
//            peopleInsideTheStore.add(name);
//            System.out.println("people inside the store -" + peopleInsideTheStore+ ". Store contents = " + store.size() );

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        store.add(new Object());
        System.out.println(name + " added a shirt. Store size is now " + store.size());
//        peopleInsideTheStore.remove(name);
        cs.release();
    }
}
