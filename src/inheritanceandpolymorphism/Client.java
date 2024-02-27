package inheritanceandpolymorphism;

public class Client {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(37);
        e.setSalary(100);
        e.setName("Sindhu");
        System.out.println(e.getId());
        System.out.println(e.getSalary());
        System.out.println(e.getName());
        Cat c = new Cat();
        c.eat();
        c.breathe();

        Animal A = new Dog();
        A.eat();
        A.breathe();
        A.speak();

        Instructor i = new Instructor(37,"sindhu.rudraboina@gmail.com", "password", 4);

        Human h = new Human();
        h.breathing();
        h.eating();

        //When reference variable of parent type is used
        //to refer a child class object -> Upcasting
        //Upcasting is implicit.

        Human hWorker = new Worker(); //upcasting
        hWorker.eating();
        hWorker.breathing();

        //downcasting -> referring to parent using
        // child type reference variable.
        // Explicit because we need to mention the downcasting
        Worker w = (Worker)new Human();
        w.getSalary(); // downcasting is very prone to errors and will fail multiple time
        // Downcasting is not preffered.
    }
}
