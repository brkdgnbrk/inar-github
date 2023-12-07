package week_10.assignment.question_10_14;

import java.util.GregorianCalendar;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        MyDate myDate1 = new MyDate(34355555133101L);
        System.out.println("Date1: "+myDate.getDay()+"/"+myDate.getMonth()+"/"+myDate.getYear());
        System.out.println("Date1: "+myDate1.getDay()+"/"+myDate1.getMonth()+"/"+myDate1.getYear());
    }
}
