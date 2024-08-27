package LAMBDAS;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class DemoOnLambdas {
    public static void main(String[] args) {
        //anonymous object or type
        BiPredicate<Integer, String> way2=new BiPredicate<Integer, String>() {
            @Override
            public boolean test(Integer integer, String s) {
                return false;
            }
        };
        System.out.println("way2 : "+ way2.test(6,"sindhu"));
        //make a class
        BiPredicate<Integer, String> way1=new DemoClassforBiPred();
        System.out.println("way1 : "+ way1.test(5,"sindhu"));
        //using lambda
        BiPredicate<Integer, String> way3=(minLength, str)->{
            if(str.length()>minLength){
                return true;
            }else{
                return false;
            }
        };
        System.out.println("way3 : " + way3.test(4,"hello"));

        BinaryOperator<String> bop=(s1, s2)->{
            return s1+s2;
        };
        System.out.println(bop.apply("Sindhu" , " Rudraboina"));
        BinaryOperator<String> o2=(s1, s2) -> s1+s2;
        System.out.println(o2.apply("Hi", " Hyderabad"));
        BiConsumer<Integer, String> o3=(num, str) ->{
            System.out.println("BiConsumer number "+num);
            System.out.println("BiConsumer String "+str);
        };
        o3.accept(10, "Sreehan");
        //Lambdas are a way of representing functions whi ch can be assigned to functional interfaces.
    }
}
