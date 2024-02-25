package OOps1;

public class Student {
    int marks; //class variable, attribute variable, instance variable -> dont need to be initialised
    static int id;

    public void print(){
        int roll; //local variable -> need to be initialised before using them
        System.out.println(marks);
        //System.out.println(roll); -> leads to an error
    }
}
