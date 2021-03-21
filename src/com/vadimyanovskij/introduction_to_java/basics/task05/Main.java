package com.vadimyanovskij.introduction_to_java.basics.task05;

public class Main {

    private static final int T = 12123;

    public static void main(String[] args) {
        TimeFormatter formatter = new TimeFormatter(T);
        System.out.println(formatter.format());
    }

}
