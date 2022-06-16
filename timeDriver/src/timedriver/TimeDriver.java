package timedriver;

public class TimeDriver {

    public static void main(String[] args) {
        System.out.println("Ch 7 Time by Kevin Bell\n");
        Time onlyHour = new Time(5);
        Time HourMin = new Time(7, 30);
        Time HourMinSec = new Time(15, 16, 17);
        Time AM = new Time(3, 45, 20, "am");
        Time PM = new Time(6, 12, 45, "pm");
        onlyHour.display();
        HourMin.display();
        HourMinSec.display();
        AM.display();
        PM.display();
    }
}
