package com.vadimyanovskij.introduction_to_java.basics.task09;

public class PointChecker {

    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    public PointChecker(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public boolean check() {
        return (secondPoint.getX() - firstPoint.getX()) *
                (thirdPoint.getY() - firstPoint.getY()) -
                (secondPoint.getY() - firstPoint.getY()) *
                        (thirdPoint.getX() - firstPoint.getX())
                == 0;
    }
}
