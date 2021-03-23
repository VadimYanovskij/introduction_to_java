package com.vadimyanovskij.introduction_to_java.basics.task10;

public class BrickChecker {

    public static boolean check(Socket socket, Brick brick) {
        return ((socket.getSideA() >= brick.getRidgeX()) &&
                (socket.getSideB() >= brick.getRidgeY())) ||
                ((socket.getSideA() >= brick.getRidgeY()) &&
                        (socket.getSideB() >= brick.getRidgeX())) ||
                ((socket.getSideA() >= brick.getRidgeX()) &&
                        (socket.getSideB() >= brick.getRidgeZ())) ||
                ((socket.getSideA() >= brick.getRidgeZ()) &&
                        (socket.getSideB() >= brick.getRidgeX())) ||
                ((socket.getSideA() >= brick.getRidgeY()) &&
                        (socket.getSideB() >= brick.getRidgeZ())) ||
                ((socket.getSideA() >= brick.getRidgeZ()) &&
                        (socket.getSideB() >= brick.getRidgeY()));
    }

}
