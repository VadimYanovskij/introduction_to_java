package com.vadimyanovskij.introduction_to_java.basics.task03;

public class FunctionCalculator {

    private final double x;
    private final double y;
    private final double z;

    public FunctionCalculator(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = calculate();
    }

    public double getZ() {
        return z;
    }

    private double calculate() {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) *
                Math.tan(x * y);
    }
}
