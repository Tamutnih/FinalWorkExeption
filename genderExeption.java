package main.java.com.example;

public class genderException extends Exception {
    public genderException() {
    }

    public void genderException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("It`s not correct data: %s", i);
        System.out.println();
    }
}