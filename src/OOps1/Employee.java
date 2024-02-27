package OOps1;

public class Employee {
    int id;
    String name;
    int salary;
    String department;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, String department, int salary){
        this(id, name); // this is used for two this -> this. : means accessing current object, this() means constructor of same class
        this.department = department;
        this.salary = salary;
    }

    public Employee(Employee e){
        this(e.id, e.name, e.department, e.salary);
    }

    public Employee(){
    }
}
