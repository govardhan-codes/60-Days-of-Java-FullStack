package day05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        System.out.println("=== Basic try-catch ===");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        System.out.println("\n=== Multiple catch blocks ===");
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } catch (Exception e) {
            System.out.println("Other Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("\n=== throw & throws ===");
        try {
            methodThatThrows();
        } catch (IOException e) {
            System.out.println("Handled IOException: " + e.getMessage());
        }

        System.out.println("\n=== Try-with-resources ===");
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            System.out.println("File First Line: " + br.readLine());
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        System.out.println("\n=== Custom Exception ===");
        try {
            checkAge(15);
        } catch (UnderAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }

    static void methodThatThrows() throws IOException {
        throw new IOException("Demo IOException thrown");
    }

    static void checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Age must be 18 or older");
        }
        System.out.println("Age is valid");
    }
}
