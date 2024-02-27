package DemoOnAbstractClasses;

public class Client {
    public static void main(String[] args) {
        Employee e1 = new SDE();
        e1.empid = 1;
        e1.name = "Sundar";
        e1.markAttendance(true);
        e1.work();

        Employee e2 = new HR();
        e2.empid = 2;
        e2.name = "XYZ";
        e2.markAttendance(true);
        e2.work();
    }
}
