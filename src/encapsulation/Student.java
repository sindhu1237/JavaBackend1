package encapsulation;

public class Student {
    String name;
    int age;
    double marks;
    void greet() {
        System.out.println("Hi, My name is "+ " "+this.name +" and I got "+ this.marks + "marks");
    }
    public void display() {
        System.out.println("Name "+ this.name);
        System.out.println("Marks "+ this.marks);
        System.out.println("Age " + this.age);
    }
}
