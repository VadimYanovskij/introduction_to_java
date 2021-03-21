package com.vadimyanovskij.introduction_to_java.basics.task01;

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
        return ((a - 3) * b / 2) + c;
    }
}
