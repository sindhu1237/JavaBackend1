package Threads_Demo.parallelMergeSort;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = Arrays.asList(2, 5, 9, 1, 7, 3, 6, 4);
        ExecutorService es = Executors.newFixedThreadPool(10);
        MergeSorter ms = new MergeSorter(es, list);
        Future<List<Integer>> promiseOfaSortedList = es.submit(ms);

        List<Integer> SortedList = promiseOfaSortedList.get();
        System.out.println(SortedList + " is processed by "+ Thread.currentThread().getName());

        es.shutdown();
    }
}
