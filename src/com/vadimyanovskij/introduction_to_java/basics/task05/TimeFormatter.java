package com.vadimyanovskij.introduction_to_java.basics.task05;

public class TimeFormatter {

    private int seconds;

    public TimeFormatter(int seconds) {
        this.seconds = seconds;
    }

    public String format() {
        return String.format("%02d:%02d:%02d",
                seconds / 3600,
                seconds % 3600 / 60,
                seconds % 60);
    }
}
