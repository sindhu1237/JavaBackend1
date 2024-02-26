package DemoOnDefaultInterfaceMethods;

public class C implements I1, I2 {
    @Override
    public void fun() {
        System.out.println("Logic");
        I1.super.fun();
    }
}
