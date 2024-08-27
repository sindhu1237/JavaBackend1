package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FindConstructors {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class pdetails = Class.forName("Reflection.Person");
//        System.out.println(pdetails.getDeclaredConstructors()); return address
        Constructor[] constr= pdetails.getDeclaredConstructors();
        for(Constructor construct:constr){
            System.out.println(construct.getParameterCount());
        }
    }
}
