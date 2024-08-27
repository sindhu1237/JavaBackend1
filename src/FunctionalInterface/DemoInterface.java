package FunctionalInterface;

@FunctionalInterface
public interface DemoInterface {
    void fun();
    default void fun2(){}
}
