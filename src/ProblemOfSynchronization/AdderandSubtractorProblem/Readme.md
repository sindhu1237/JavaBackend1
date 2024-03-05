# Problem of Synchronization
* Multiple threads attempting to access same variable.

* In the problem of adding and subtracting, there is a synchronization issue that results in unpredictable values.
*  If there is no synchronization problem in the above program (adder and subtractor) it will return 10 as output.

### conditions that lead to synchronisation
1. Critical Section
2. Race Condition
3. Pre-emption
* In multithreaded applications, synchronization problems may arise when multiple threads share data and execute a critical section of code simultaneously. A critical section is a part of the code that manipulates the same data. If two or more threads enter this section simultaneously, a race condition can occur.

* To prevent this issue, pre-emption is necessary. Pre-emption involves a context switch during the execution of the critical section of the first thread, allowing other threads to access the shared data without interference.

* ## t.join() 
  * makes the invoking thread(main thread) to wait for invoked thread to finish

## Solution 1 : Mutex 

* Take locks on smallest required area.
* lock.lock()
* lock.unlock()