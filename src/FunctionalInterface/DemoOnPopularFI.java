package FunctionalInterface;

import java.util.function.*;

public class DemoOnPopularFI {
    public static void main(String[] args) {
        Consumer<Integer> obj=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
//            takes one parameter but returns nothing
            }
        };
        BiConsumer<String, Integer> biconsumer=new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {

            }
        };
        Predicate<Integer> pr=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        BiPredicate<String, Integer> bi_pr=new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer integer) {
                return false;
            }
        };
//      function takes 2 types one is argument and next is return type.
        Function<String,Integer> func=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return null;
            }
        };
//        function takes 3 types first two are arguments and next is return type.
        BiFunction<Integer, String, Double> bifunction=new BiFunction<Integer, String, Double>() {
            @Override
            public Double apply(Integer integer, String s) {
                return null;
            }
        };

        BinaryOperator<Integer> bo=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return null;
            }
        };
    }
}
