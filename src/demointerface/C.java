package demointerface;

public class C implements I {
    int x = 20;

    @Override
    public void fun() {
        System.out.println("I am fun of class C");
        System.out.println(x);
        System.out.println(I.x);
    }
    public void fun2() {
        System.out.println("fun2 is specific to only class C");
    }

}
