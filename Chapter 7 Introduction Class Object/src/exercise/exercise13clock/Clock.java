package exercise.exercise13clock;

public class Clock {
    private Integer hour;
    private Integer minutes;
    private Integer seconds;

    public Clock(Integer hour, Integer minutes, Integer seconds) {
        if (hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
        if (minutes > 59) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
        if (seconds > 59) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        if (hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        if (minutes <= 59) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        if (seconds <= 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public void displayTime() {
        System.out.printf("%d:%d:%d", hour, minutes, seconds);
    }
}
