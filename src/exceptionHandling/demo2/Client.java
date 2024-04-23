package exceptionHandling.demo2;

import exceptionHandling.demo1.InputMismatch;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Hello");
            System.out.println("shello");
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            System.out.println("Bye");
            System.out.println("sbye");
        }catch(InputMismatchException ime){
            // log the exception
            System.out.println("A bug occurred : " + ime );
        }
        System.out.println("Program has not crashed that is why we are executing this statement");
    }
}
