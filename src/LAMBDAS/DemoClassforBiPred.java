package LAMBDAS;

import java.util.function.BiPredicate;

public class DemoClassforBiPred implements BiPredicate<Integer, String> {
    @Override
    public boolean test(Integer integer, String s) {
        return false;
    }

}
