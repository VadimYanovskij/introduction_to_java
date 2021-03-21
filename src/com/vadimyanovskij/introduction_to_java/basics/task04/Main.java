package com.vadimyanovskij.introduction_to_java.basics.task04;

public class Main {

    private static final double R = 159.973;

    public static void main(String[] args) {
        IntegerAndFractionalPartsSwapper swapper =
                new IntegerAndFractionalPartsSwapper(R);

        System.out.println(swapper.swap());
    }
}
