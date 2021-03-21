package com.vadimyanovskij.introduction_to_java.basics.task01;

public class VariableReader {

    private DoubleReader doubleReader;

    public VariableReader(DoubleReader doubleReader) {
        this.doubleReader = doubleReader;
    }

    public double read()  {
            System.out.println("Enter decimal number and press Enter");
            return doubleReader.read();
    }
}
