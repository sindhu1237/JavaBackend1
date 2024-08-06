package DemoOnDefaultInterfaceMethods;

public class C implements I1, I2 {
    @Override
    public void fun() {
        System.out.println("Logic");
        I2.super.fun();
    }

    public static void main(String[] args) {
        C c=new C();
        c.fun();
    }
}
