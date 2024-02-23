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
    }
}
