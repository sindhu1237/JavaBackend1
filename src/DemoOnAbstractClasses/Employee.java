package DemoOnAbstractClasses;

public abstract class Employee {
    int empid;
    String name;

    void markAttendance(boolean flag){
        if(flag){
            System.out.println(name + " is present");
        } else {
            System.out.println(name + " is absent");
        }
    }

    abstract void work();
}
