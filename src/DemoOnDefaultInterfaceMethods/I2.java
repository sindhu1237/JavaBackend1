package DemoOnDefaultInterfaceMethods;

public interface I2 {
    default void fun(){
        System.out.println("I2's default for fun method");
    }
}
