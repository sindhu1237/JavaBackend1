package inheritanceandpolymorphism;

public class Worker extends Human{ // s2 => newer TV
    private int salary;
    public void salaryPaid() {
        System.out.println("Salary is paid to worker");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
