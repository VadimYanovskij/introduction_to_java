package com.vadimyanovskij.introduction_to_java.basics.task11;

public class FunctionCalculator {

    public static double calculate(double x) {
        if (x <= 3) {
            return x * x - 3 * x + 9;
        }
        return 1 / (x * x * x + 6);
    }

}
