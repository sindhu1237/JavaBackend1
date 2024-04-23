package exceptionHandling.demo1;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        System.out.println("shello");
        File f = new File("abc.txt");
        FileReader fr = new FileReader(f);
        fr.read();
        System.out.println("Bye");
        System.out.println("sbye");
    }
}
