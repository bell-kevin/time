package timedriver;

public class TimeDriver {

    public static void main(String[] args) {
        System.out.println("Ch 7 Time by Kevin Bell\n");
        Time onlyHour = new Time(1);
        Time HourMin = new Time(2, 45);
        Time HourMinSec = new Time(14, 15, 16);
        Time AM = new Time(1, 2, 3, "am");
        Time PM = new Time(11, 12, 13, "pm");
        onlyHour.display();
        HourMin.display();
        HourMinSec.display();
        AM.display();
        PM.display();
    }
}
