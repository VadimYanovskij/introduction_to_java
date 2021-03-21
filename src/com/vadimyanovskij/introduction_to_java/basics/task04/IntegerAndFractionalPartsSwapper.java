package com.vadimyanovskij.introduction_to_java.basics.task04;

public class IntegerAndFractionalPartsSwapper {

    private double number;
    private double result;

    public IntegerAndFractionalPartsSwapper(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getResult() {
        return result;
    }

    public double swap() {
        int integerPart = (int) number;
        double fractionalPart = Math.floor((number - integerPart) * 1000) / 1000;
        double result = (double) integerPart / 1000 + fractionalPart * 1000;
        this.result = result;
        return result;
    }
}
