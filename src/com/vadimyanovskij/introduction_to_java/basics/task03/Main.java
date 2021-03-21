package com.vadimyanovskij.introduction_to_java.basics.task03;

public class Main {
    public static void main(String[] args) {
        VariableReader variableReader = new VariableReader(new DoubleReader());
        variableReader.read();
        FunctionCalculator functionCalculator = new FunctionCalculator(
                variableReader.getX(),
                variableReader.getY()
        );
        System.out.println("z = " + functionCalculator.getZ());
    }
}
