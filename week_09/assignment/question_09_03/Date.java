package week_09.assignment.question_09_03;

public class Date {
    public static void main(String[] args) {
        java.util.Date time = new java.util.Date();
        long millliSecond=10000;
        for (int i = 1; i <= 8; i ++) {
            time.setTime(millliSecond);
            System.out.println("For elapsed " + millliSecond + " time is " + time.toString());
            millliSecond*=10;
        }
    }
}
