### **Executor Service**:
An Executor Service uses a Thread Pool to execute tasks in parallel and a Waiting Queue to hold tasks waiting to be executed. 
An Executor Service is a programming construct that utilizes a Thread Pool to execute tasks in parallel and a Waiting Queue to hold tasks waiting to be executed. 

### **Callable**:
A Callable is similar to a Runnable but can return a value and is a generic type. We submit the Executor Service to a Future object to retrieve the return value from a thread.
A Callable is similar to a Runnable in that it represents a task that a thread can execute. However, unlike Runnable, Callable can return a value and is a generic type. We submit the Executor Service to a Future object to retrieve the return value from a thread.

### **Problem of Synchronization**
Multiple threads attempt to access the same variable.
One of the common problems in multi-threading is the issue of synchronization. Since multiple threads can access the same variable simultaneously, it may cause unexpected results.
