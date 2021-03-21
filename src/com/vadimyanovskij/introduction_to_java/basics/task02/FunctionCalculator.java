package com.vadimyanovskij.introduction_to_java.basics.task02;

public class FunctionCalculator {

    private final double a;
    private final double b;
    private final double c;
    private final double z;

    public FunctionCalculator(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = calculate();
    }

    public double getZ() {
        return z;
    }

    private double calculate() {
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a ) -
                Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
