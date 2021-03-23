package com.vadimyanovskij.introduction_to_java.basics.task10;

public class Main {
    public static void main(String[] args) {
        Brick brick = new Brick(5,2,3);
        Socket socket = new Socket(3,2);
        System.out.println(BrickChecker.check(socket,brick));
    }
}
