package Reflection;

public class ReflectionDemo {
    public static void main(String[] args) {
        String s="hello"; // String is the class and s is an object of string class.
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        try{
            Class detailsofString=Class.forName("java.lang.String");
            ReflectionDemo r=new ReflectionDemo();
/**
*
*/
            Class ref= r.getClass();
            System.out.println(ref);
            System.out.println(detailsofString);
            System.out.println(detailsofString.getDeclaredConstructors().length);
            System.out.println(detailsofString.getDeclaredFields().length);
            System.out.println(detailsofString.getDeclaredMethods().length);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
