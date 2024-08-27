package Reflection;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    Person(){

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
    void sayHello(){
        System.out.println(name + "["  + age + "]" + " sayHello");
    }
    private void display(){
        System.out.println(name + " is my name");
    }
}
