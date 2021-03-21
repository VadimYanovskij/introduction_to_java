package com.vadimyanovskij.introduction_to_java.basics.task06;

public class PointChecker {

    private Point point;

    public PointChecker(Point point) {
        this.point = point;
    }

    public boolean check() {
        return (point.getX() >= -2 && point.getX() <= 2 &&
                point.getY() >= 0 && point.getY() <= 4) ||
                (point.getX() >= -4 && point.getX() <= 4 &&
                        point.getY() >= -3 && point.getY() <= 0);
    }
}
