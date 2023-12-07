package week_10.assignment.question_10_14;
import java.util.GregorianCalendar;
public class MyDate {
    private int year;
    private int month;
    private int day;
    GregorianCalendar calendar = new GregorianCalendar();
    public MyDate(){

        year = calendar.get(GregorianCalendar.YEAR);
        month = (calendar.get(GregorianCalendar.MONTH)+1);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

    }
    MyDate(long elapsedTime){
setDate(elapsedTime);
    }
    MyDate(int year,int month,int day){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setDate(long elapsedTime){
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        }
    }




