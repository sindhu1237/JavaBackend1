package exceptionHandling.demo1;

import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("shello");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Bye");
        System.out.println("sbye");
    }
}
