package com.vadimyanovskij.introduction_to_java.basics.task13;

public class FunctionCalculator {

    public static double calculateOne(double x) {
        if (x > 2) {
            return x;
        }
        return x * -1;
    }

    public static double calculateSegmentInIncrements(double a, double b,
                                                      double h) {
        double result = 0;
        for (double i = a ; i <= b ; i += h){
            result += calculateOne(i);
        }
        return result;
    }

}
