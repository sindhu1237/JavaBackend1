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

* `Hash Table` is a data structure that organizes data using hash functions to support quick insertion and search.
* The key idea of Hash Table is to use a hash function to map keys to buckets.
  1. When we insert a new key, the hash function will decide which bucket the key should be assigned and the key will be stored in the corresponding bucket;
  2. When we want to search for a key, the hash table will use the same hash function to find the corresponding bucket and search only in the specific bucket.

**## Exception Handling**
- _Exception_ => Something unusual or unexpected.
* # What is exception?
  - An unexpected scenario.
  `void readContentsofaFile(String filename){
    File f = new File(filename with path);
    FileReader fr = new FileReader(f);
    fr.read();
  }`
  `main() {
    readContentsofaFile('abc.text');
  }`
  - If the file doesn't exist leads to **File Not Found Exception**.
  `Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();`
  **output : "Hello"
            Input mismatch foundException**

* # What happens if an exception is not handled ?
- Program crashes
- Application shutdown
- stops abruptly.
- Bad surprise for clients.

* # How to handle an exception and why is that necessary ?
- Application doesn't crash and client can see something sensible if exception is handled.
- Exception can be handled using try, catch and finally.

`void readContentsofaFile(String filename){
try{
File f = new File(filename with path);
FileReader fr = new FileReader(f);
fr.read();
}catch(FileNotFoundException e){
System.out.println(e);
}
}`
`main() {
readContentsofaFile('abc.text');
}`

* # Is there a way to write try catch which can handle all kind of exceptions ?
- 