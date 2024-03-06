package ProblemOfSynchronization.DemoforconcurrentDS;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Client {
    public static void main(String[] args) {
        /*
        navigate to implementation of buffer, buider,
        hashmap, hashtable, concurrent hash map to check
        whether they are synchronized or not.
         */
        StringBuffer sb = new StringBuffer();
        StringBuilder sb1 = new StringBuilder();
        HashMap<String, Integer> hm= new HashMap<>();
        Hashtable<String, Integer> ht = new Hashtable<>();
        ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();
    }
}
