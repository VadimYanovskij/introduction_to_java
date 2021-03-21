package com.vadimyanovskij.introduction_to_java.basics.task01;

import java.util.Scanner;

public class DoubleReader {

    private Scanner scanner = new Scanner(System.in);

    public double read() {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            scanner.nextLine();
            return read();
        }
    }
}
