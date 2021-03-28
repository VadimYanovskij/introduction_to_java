package com.vadimyanovskij.introduction_to_java.basics.task12;

import java.util.Scanner;

public class IntegerReader {

    private Scanner scanner = new Scanner(System.in);

    public int read() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            return read();
        }
    }
}
