package com.vadimyanovskij.introduction_to_java.basics.task01;

public class Main {
    public static void main(String[] args) {
        VariableReader variableReader = new VariableReader(new DoubleReader());
        FunctionCalculator functionCalculator = new FunctionCalculator(
                variableReader.read(),
                variableReader.read(),
                variableReader.read()
        );
        System.out.println("z = " + functionCalculator.getZ());
    }
}
