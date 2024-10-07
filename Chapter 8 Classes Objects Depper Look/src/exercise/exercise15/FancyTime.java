package exercise.exercise15;

import java.util.Objects;

public class FancyTime {
    private int hour; // 0-23
    private int minute; // 0 - 60
    private int second; // 0 - 60
    private String meridiem;

    public FancyTime(int hour, int minute) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
    }

    public FancyTime(int hour, int minute, int second) {

        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
    }

    public FancyTime(int hour, int minute, int second, String meridiem) {

        if (hour < 0 || hour >= 12) {
            throw new IllegalArgumentException("hour must be 0-12");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        if (!Objects.equals(meridiem, "AM") && !Objects.equals(meridiem, "PM")) {
            throw new IllegalArgumentException("Meridiem must be AM or PM");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridiem = meridiem;
    }

    public String displayTime(int hourDisplayOption) {
        switch (hourDisplayOption) {
            case 1:
                return String.format("%d:%02d:%02d %s", hour, minute, second, meridiem);
            case 2:
                return String.format("%d:%02d:%02d", hour, minute, second);
        }

        return String.format("%d:%02d", hour, minute);
    }
}
