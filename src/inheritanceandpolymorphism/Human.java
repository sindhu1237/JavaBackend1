package inheritanceandpolymorphism;

public class Human { // s1 => older TV
    private int age;
    private String name;

    public void eating() {
        System.out.println("Human is Eating");
    }
    public void breathing() {
        System.out.println("Human is breathing");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
