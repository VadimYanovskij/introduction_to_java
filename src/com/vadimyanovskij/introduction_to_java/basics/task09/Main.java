package com.vadimyanovskij.introduction_to_java.basics.task09;

public class Main {
    public static void main(String[] args) {

//        Point A1 = new Point(-2, 5);
//        Point A2 = new Point(4,3);
//        Point A3 = new Point(16,-1);

        Point A1 = new Point(-2, 1);
        Point A2 = new Point(0,3);
        Point A3 = new Point(-7,-4);

        PointChecker checker = new PointChecker(A1, A2, A3);
        System.out.println(checker.check());
    }
}
