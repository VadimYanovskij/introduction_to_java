package com.vadimyanovskij.introduction_to_java.basics.task12;

public class VariableReader {

    private static IntegerReader integerReader = new IntegerReader();
    private static int a;

    public static int read() {
        System.out.println("Enter any positive integer and press Enter.");
        a = integerReader.read();
        if (a <= 0) {
            System.out.println("Your number <= 0");
            read();
        }
        return a;
    }
}
