package com.vadimyanovskij.introduction_to_java.basics.task13;

public class VariableReader {

    private DoubleReader doubleReader;

    private double a;
    private double b;
    private double h;

    public VariableReader(DoubleReader doubleReader) {
        this.doubleReader = doubleReader;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public void read() {
        readA();
        readB();
        readH();
    }

    private void readA() {
        System.out.println("Enter decimal number a and press Enter");
        a = doubleReader.read();
    }

    private void readB() {
        System.out.println("Enter decimal number b and press Enter");
        b = doubleReader.read();
    }

    private void readH() {
        System.out.println("Enter decimal number H and press Enter. " +
                "Number must be greater than zero");
        h = doubleReader.read();
        if (h <= 0) {
            readH();
        }
    }
}
