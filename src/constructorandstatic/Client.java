package constructorandstatic;

import inheritanceandpolymorphism.Employee;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        System.out.println("----------");
        Student Sindhu = new Student();
        Sindhu.age = 10;
        Sindhu.display();
        System.out.println("----------");
        Student st = new Student(24, "CustomConstructor");
        st.display();
        System.out.println("----------");
        Student sree = new Student(10, 12, 98, "sree");
        sree.display();
        System.out.println("----------");
        /**
         * Demo for Shallow vs deep copy
         */
        System.out.println("Shallow copy");
        Student s1 = new Student();
        Student s2 = s1;
        s1.display();
//        System.out.println("----------");
        s2.age = 100;
        s1.display();
        System.out.println("----------");
        System.out.println("Deep copy");
        Student s10 = new Student(20,2, 200, "s10");
        Student s20 = new Student(s10);
        s10.display();
        s20.display();

        FixedDeposit.printFDDetails();

        Employee e =  new Employee();
//        e.id = 37;
    }
}
