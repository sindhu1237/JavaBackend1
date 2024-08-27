package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FindFields {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class pdetails = Class.forName("Reflection.Person");
        Constructor ctorWith2Params =pdetails.getDeclaredConstructor(int.class, String.class);
        Object p=ctorWith2Params.newInstance(10, "venkat");
//        System.out.println(p);
        Field ageField= pdetails.getDeclaredField("age");
        System.out.println(ageField);
        ageField.setAccessible(true);//changing from private to public
        int valueOfageField=(int) ageField.get(p);
        System.out.println(valueOfageField);
//        We can even change the value of private variable.
        ageField.set(p, 20);
        int updated_valueOfageField=(int) ageField.get(p);
        System.out.println("After updating private variable age from 10 to 20  = "+updated_valueOfageField);
    }
}
