package DemoOnDefaultInterfaceMethods;

public interface I1 {
    default void fun(){
        System.out.println("I1's default for fun method");
    }
}
