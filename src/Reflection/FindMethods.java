package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FindMethods {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class pdetails = Class.forName("Reflection.Person");
        Constructor ctorWith2Params = pdetails.getDeclaredConstructor(int.class, String.class);
        Object p = ctorWith2Params.newInstance(10, "Sindhu");
        Method sayHelloMethod = pdetails.getDeclaredMethod("sayHello");
        System.out.println(sayHelloMethod.getReturnType().getSimpleName());
        sayHelloMethod.invoke(p);
        Method DisplayMethod = pdetails.getDeclaredMethod("display");
        DisplayMethod.setAccessible(true);
        System.out.println(DisplayMethod.getReturnType().getSimpleName());
        DisplayMethod.invoke(p);
    }
}
