package inheritanceandpolymorphism.overloadingandoverriding;

public class Calculator {
    //Method signature -> Java indentifies, combination of name and parameteres.
    public void add(int a, int b){ //add(int, int) -> Method signature
        System.out.println(a+b);
    }

    public void add(double a, double b){ //add(double,double)
        System.out.println(a+b);
    }

    public void add(int a, double b){ //add(int,double)
        System.out.println(a+b);
    }

    public void add(double a, int b){ //add(double,int)
        System.out.println(a+b);
    }
}
