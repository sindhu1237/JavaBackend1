package exceptionHandling.finallydemo;

import exceptionHandling.demo1.InputMismatch;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Hello");
            System.out.println("shello");
            int n = scn.nextInt();
            System.out.println("Bye");
            System.out.println("sbye");
        }catch(InputMismatchException ime){
            // log the exception
            System.out.println("A bug occurred : " + ime );
        }
        finally{
            System.out.println("Only for testing purpose");
            scn.close();
//            int s = scn.nextInt();
//            System.out.println(s);
        }
        System.out.println("Program has not crashed that is why we are executing this statement");
    }
}
