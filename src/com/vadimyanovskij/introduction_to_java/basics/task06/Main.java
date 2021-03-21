package com.vadimyanovskij.introduction_to_java.basics.task06;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(2, -3);
        PointChecker checker = new PointChecker(point);
        System.out.println(checker.check());
    }
}
