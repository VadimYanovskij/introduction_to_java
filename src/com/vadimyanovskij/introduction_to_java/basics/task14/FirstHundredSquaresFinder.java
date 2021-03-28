package com.vadimyanovskij.introduction_to_java.basics.task14;

public class FirstHundredSquaresFinder {

    private static int HUNDRED = 100;

    public static int find() {
        int result = 0;
        for (int i = 1 ; i <= HUNDRED ; i++) {
            result += i * i;
        }
        return result;
    }

}
