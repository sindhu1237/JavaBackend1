package Reflection;

public class LoadAClass {
    public static void main(String[] args) {
//        3 ways to load a class
//        1st method
        try {
            Class pdetails = Class.forName("Reflection.Person");
            System.out.println(pdetails.getSimpleName());
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
//        2nd method
        Class p_details = Person.class;
        System.out.println(p_details.getSimpleName());
//        3rd method
        Person p=new Person(3, "srihaan");
        Class pDetails=p.getClass();
        System.out.println(pDetails.getSimpleName());
    }
}
