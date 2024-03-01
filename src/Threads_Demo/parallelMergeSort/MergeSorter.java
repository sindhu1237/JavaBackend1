package Threads_Demo.parallelMergeSort;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> listToSort;
    ExecutorService es;
    MergeSorter(ExecutorService es, List<Integer> listToSort) {
        this.listToSort = listToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        return null;
    }
}
