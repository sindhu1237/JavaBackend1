package constructorandstatic;

public class Student {
    int age;
    int roll;
    double marks;
    String name;

   // no args constructor
    Student() { // java identifies this constructor as Student()
        // here only age gets intialised, remaining will hold default values
        this.age = 24; // this --> refers to the object being created by the constructor
        this.roll = 37;
    }
     // Student getting admission scenario, we know name and age, but not marks and roll
    // Parameterised constructor (as a good practice, always name your parameters same as attributes of the class
    Student(int age, String name) { // java identifies this constructor as Student(int, String)
        //here only age and name are intialised, remaining will hold default values.
        this.age =  age;
        this.name = name;
    }

    public Student(int age, int roll, double marks, String name) { // java identifies this constructor as Student(int, int, double, String)
        // all the attributes are being intialised
        this.age = age;
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }
    //copy constructor -> passing object of same class, to read the values, create a new obj and initialise them with the values of the object being passed as a parameter
    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.roll = student.roll;
        this.marks = student.marks;
    }
    public void display() {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Marks : "+this.marks);
        System.out.println("Roll : "+this.roll);
    }
}

/* *
    class NAME {
         attributes

         constructors

         methods
    }
 */
