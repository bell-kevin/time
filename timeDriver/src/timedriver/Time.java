package timedriver;

class Time {

    private int hours, minutes, seconds;
    private String AMorPM;

    Time(int hours) {
        this.hours = hours;
    }

    Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Time(int hours, int minutes, int seconds, String AMorPM) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        if (AMorPM.equalsIgnoreCase("PM")) {
            this.hours = this.hours + 12;
        }
    }

    void display() {
        System.out.println("Time = " + this.hours + ":" + this.minutes + ":" + this.seconds);
    }
}
