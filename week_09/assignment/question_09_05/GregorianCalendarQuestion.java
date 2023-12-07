package week_09.assignment.question_09_05;

import javax.crypto.spec.PSource;
import java.util.GregorianCalendar;

public class GregorianCalendarQuestion {
    public static void main(String[] args) {

        GregorianCalendar time = new GregorianCalendar();
        int currentYear = time.get(GregorianCalendar.YEAR);
        int currentMonth = time.get(GregorianCalendar.MONTH) + 1;
        int currentDayOfMonth = time.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Current year: "+currentYear+"\n" +
                "Current month: "+currentMonth+"\n" +
                "Current day: "+currentDayOfMonth+"\n");
        time.setTimeInMillis(1234567898765L);
         currentYear = time.get(GregorianCalendar.YEAR);
         currentMonth = time.get(GregorianCalendar.MONTH) + 1;
        currentDayOfMonth = time.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Current year: "+currentYear+"\n" +
                "Current month: "+currentMonth+"\n" +
                "Current day: "+currentDayOfMonth+"\n");
    }
}