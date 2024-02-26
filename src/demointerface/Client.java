package demointerface;

public class Client {
    public static void main(String[] args) {
        I o1 = new C();
        o1.fun();
        System.out.println(o1.x);
//        o1.fun2();
//        cannot find symbol
//        symbol:   method fun2()
//        location: variable o1 of type demointerface.I
        C obj = new C();
        obj.fun();
        obj.fun2();

        I o2 = new C();
        System.out.println(o2.x);
        System.out.println(I.x);
    }
}
