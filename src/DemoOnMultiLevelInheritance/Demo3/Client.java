package DemoOnMultiLevelInheritance.Demo3;

public class Client {
    public static void main(String[] args) {
        I1 o1 = new C();
        o1.fun();

        I2 o2 = new C();
        o2.fun();

        C o3 = new C();
        o3.fun();
    }
}
