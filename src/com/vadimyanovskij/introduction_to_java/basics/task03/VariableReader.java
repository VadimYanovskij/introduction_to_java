package com.vadimyanovskij.introduction_to_java.basics.task03;

public class VariableReader {

    private DoubleReader doubleReader;
    private double x;
    private double y;

    public VariableReader(DoubleReader doubleReader) {
        this.doubleReader = doubleReader;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void read() {
        System.out.println("Enter decimal variable x and press Enter");
        this.x = doubleReader.read();
        System.out.println("Enter decimal variable y and press Enter");
        this.y = doubleReader.read();
        while (checkZero()) {
            read();
        }

    }

    private boolean checkZero() {
        return Math.cos(x) - Math.sin(y) == 0;
    }
}
