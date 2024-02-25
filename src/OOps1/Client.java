package OOps1;

public class Client {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.print();
//        System.out.println(Student.id);
        Employee e = new Employee(1, "Sindhu"); //
        System.out.println(e.id); //1
        System.out.println(e.name); //Himanshu
        System.out.println(e.department); //null
        System.out.println(e.salary); //0

        Employee e2 = new Employee(2, "Sree", "HR", 650000);
        System.out.println(e2.id); //1
        System.out.println(e2.name); //Himanshu
        System.out.println(e2.department); //null
        System.out.println(e2.salary);

        Employee e1 = new Employee();

        Iphone iphone13 = new Iphone(13, "Iphone", 2, 6, 4, 2000, 128, 60000, 13);
        System.out.println("Iphone 13 " + iphone13);
        Iphone iphone14 = new Iphone(iphone13);
        System.out.println("Iphone 14 " + iphone14);
        // new object got created from iphone13, called iphone14 -> deep copy
        //iphone13 -> object13
        //iphone14 -> object14


        //shallow copy
        Iphone iphone15 = iphone13;
        iphone15.number = 15;
        iphone15.price = iphone13.price + 20000;
        System.out.println("Iphone 15 " + iphone15);
    }
}
