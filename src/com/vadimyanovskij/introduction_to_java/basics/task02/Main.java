package com.vadimyanovskij.introduction_to_java.basics.task02;

public class Main {
    public static void main(String[] args) {
        VariableReader variableReader = new VariableReader(new DoubleReader());
        variableReader.read();
        FunctionCalculator functionCalculator = new FunctionCalculator(
                variableReader.getA(),
                variableReader.getB(),
                variableReader.getC()
        );
        System.out.println("z = " + functionCalculator.getZ());
    }
}
