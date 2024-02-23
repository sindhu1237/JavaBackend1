package inheritanceandpolymorphism;

public class Employee {
    private int id; // by default, it is default
    private int salary;
    private String name;

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        //first verify and move to nextline
        if(salary < 0) {
            System.out.println("Invalid Salary");
        }else {
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
