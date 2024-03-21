### **Executor Service**:
An Executor Service uses a Thread Pool to execute tasks in parallel and a Waiting Queue to hold tasks waiting to be executed. 
An Executor Service is a programming construct that utilizes a Thread Pool to execute tasks in parallel and a Waiting Queue to hold tasks waiting to be executed. 

### **Callable**:
A Callable is similar to a Runnable but can return a value and is a generic type. We submit the Executor Service to a Future object to retrieve the return value from a thread.
A Callable is similar to a Runnable in that it represents a task that a thread can execute. However, unlike Runnable, Callable can return a value and is a generic type. We submit the Executor Service to a Future object to retrieve the return value from a thread.

### **Problem of Synchronization**
Multiple threads attempt to access the same variable.
One of the common problems in multi-threading is the issue of synchronization. Since multiple threads can access the same variable simultaneously, it may cause unexpected results.


### **Collection Framework**:
* Set of classes, and interfaces to manage data i.e.; built-in data structures ready to use.

  
* Iterable -> Collection -> List, Queue, Set [interfaces]

- **List**
  * ArrayList
    
    `ArrayList list = new ArrayList<>(); `
    1. Dynamic array
    2. Heap consists of size, capacity, and array address to traverse.
    3. Not synchronized and not thread-safe
    4. Use for single-threaded application
    5.  Faster performance
    Methods :
    list.add(val)   **T.C = avg(1)**
    list.get(index) **T.C = O(1)**
    list.set(position, val) ==> position [0 to size-1]  **T.C = O(1)**
    list.add(position, val) ==> position [0 to size] After size it will throw an exception  **T.C = O(n)**

* Vector
  1. Synchronized and thread-safe
  2. Use for multi-threaded application
  3. Slower performance

* LinkedList

  `LinkedList<Integer> ll = new LinkedList<>(); `
  1. Heap consists of head, tail, and size.
  2. Doubly LinkedList


- **Set**
  * HashSet

    `HashSet<Integer> hs = new HashSet<>(); `
    1. HashSet stores its elements in a hash table, which is an array of linked lists. Each element in the hash table is a bucket that contains a linked list of elements that have the same hash code.

    2. HashSet uses the `hashCode()` method to compute the hash code of each element and determine the bucket where it should be stored.
    3. HashSet uses the `equals()` method to check if two elements are equal. If two elements are equal, HashSet ensures that only one of them is stored in the collection.
    4. HashSet is not thread-safe, which means that multiple threads can modify the collection simultaneously, leading to inconsistent results. If thread safety is required,       
       the synchronized version of HashSet, called Collections.synchronizedSet(), can be used.
    5. HashSet does not maintain any order of its elements.
