package week_13.assignment.question_13_04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarProgram  {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java PrintCalendar month year");
            System.exit(1);
        }
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        Calendar calendar = new GregorianCalendar(year, month - 1, 1);

        System.out.println("        " + getMonthName(month) + " " + year);
        System.out.println("------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        printCalendarBody(calendar);
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }
    private static void printCalendarBody(Calendar calendar) {
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }


        for (int day = 1; day <= maxDay; day++) {
            System.out.printf("%4d", day);

            if ((day + startDay) % 7 == 0 || day == maxDay) {
                System.out.println();
            }
        }
    }
}