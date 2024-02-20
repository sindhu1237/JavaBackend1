package encapsulation;

public class Client {
    public static void main(String[] args) {
        Student sindhu=new Student();
        sindhu.name = "Sindhu";   // this -> current object
        sindhu.age = 24;
        sindhu.marks = 85;

        sindhu.greet();
        sindhu.display();


        Student sree=new Student();
        sree.name = "Sree";
        sree.age = 21;
        sree.marks = 85;

        sree.greet();
        sree.display();

        Square s1 = new Square();
        s1.side = 5;
        s1.getArea();
        s1.getPerimeter();

        Square s2 = new Square();
        s2.side = 6;
        s2.getArea();
        s2.getPerimeter();
    }
}
