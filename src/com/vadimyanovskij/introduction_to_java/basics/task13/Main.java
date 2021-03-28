package com.vadimyanovskij.introduction_to_java.basics.task13;

public class Main {
    public static void main(String[] args) {
        VariableReader variableReader = new VariableReader(new DoubleReader());
        variableReader.read();
        System.out.println(FunctionCalculator.calculateSegmentInIncrements(
                variableReader.getA(),
                variableReader.getB(),
                variableReader.getH()
                )
        );
    }
}
