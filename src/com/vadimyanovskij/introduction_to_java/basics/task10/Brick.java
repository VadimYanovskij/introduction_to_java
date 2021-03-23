package com.vadimyanovskij.introduction_to_java.basics.task10;

public class Brick {

    private double ridgeX;
    private double ridgeY;
    private double ridgeZ;

    public Brick(double ridgeX, double ridgeY, double ridgeZ) {
        this.ridgeX = ridgeX;
        this.ridgeY = ridgeY;
        this.ridgeZ = ridgeZ;
    }

    public double getRidgeX() {
        return ridgeX;
    }

    public void setRidgeX(double ridgeX) {
        this.ridgeX = ridgeX;
    }

    public double getRidgeY() {
        return ridgeY;
    }

    public void setRidgeY(double ridgeY) {
        this.ridgeY = ridgeY;
    }

    public double getRidgeZ() {
        return ridgeZ;
    }

    public void setRidgeZ(double ridgeZ) {
        this.ridgeZ = ridgeZ;
    }
}
