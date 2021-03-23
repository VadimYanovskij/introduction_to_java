package com.vadimyanovskij.introduction_to_java.basics.Task07;

public class RectangleChecker {

    private int angleA;
    private int angleB;

    public RectangleChecker(int angleA, int angleB) {
        this.angleA = angleA;
        this.angleB = angleB;
    }

    public String check() {
        if ((angleA + angleB) >= 180) {
            return "There's no triangle with such angles";
        }
        if ((angleA == 90) || (angleB == 90) || ((angleA + angleB) == 90)) {
            return "A triangle with such angles exists and it's rectangular";
        }
        return "A triangle with such angles isexists";
    }
}
