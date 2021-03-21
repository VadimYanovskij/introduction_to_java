package com.vadimyanovskij.introduction_to_java.basics.task03;

import java.util.Scanner;

public class DoubleReader {

    private Scanner scanner = new Scanner(System.in);

    public double read() {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Еhe entered value is not a decimal number");
            scanner.nextLine();
            return read();
        }
    }
}
