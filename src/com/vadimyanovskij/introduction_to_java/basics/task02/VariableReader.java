package com.vadimyanovskij.introduction_to_java.basics.task02;

public class VariableReader {

    private DoubleReader doubleReader;

    private double a;
    private double b;
    private double c;

    public VariableReader(DoubleReader doubleReader) {
        this.doubleReader = doubleReader;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void read() {
        readA();
        readB();
        readC();
    }

    private void readA() {
        System.out.println("Enter decimal number a and press Enter. " +
                "Number must not be zero");
        a = doubleReader.read();
        if (a == 0) {
            readA();
        }
    }

    private void readB() {
        System.out.println("Enter decimal number b and press Enter");
        b = doubleReader.read();
    }

    private void readC() {
        System.out.println("Enter decimal number c and press Enter");
        c = doubleReader.read();
    }
}
