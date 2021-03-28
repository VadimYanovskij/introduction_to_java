package com.vadimyanovskij.introduction_to_java.basics.task12;

public class SumAll {

    public static int sumAll(int count) {
        int result = 0;
        for (int i = 1; i <= count; i++) {
            result += i;
        }
        return result;
    }

}
