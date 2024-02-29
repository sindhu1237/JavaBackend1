# Print 1 to 100 counting

* Print counting from 1 to 100
* But not from a single thread
* There should be 100 threads
* Each thread should print a single number

1. Identify task for thread => print a given number
2. Make a class for the task => numberPrinter
3. Implement Runnable interface
4. write run method
5. code the logic of task inside run method
6. Thread t =new Thread(numberPrinter ref);
7. t.start()

* Client is playing two responsibilities 
  * Defining the task to be done on a separate thread by making an object of number printer
  * Making threads and assigning the task to be done two different threads.

### Client is violating the single responsibility principle