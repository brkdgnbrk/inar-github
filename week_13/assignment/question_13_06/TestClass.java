package week_13.assignment.question_13_06;

public class TestClass {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1=new ComparableCircle(16.5);
        ComparableCircle comparableCircle2=new ComparableCircle(20.3);
        System.out.println(comparableCircle1);
        System.out.println();
        System.out.println(comparableCircle2);
        System.out.println();
        int result = comparableCircle1.compareTo(comparableCircle2);
        if (result < 0) {
            System.out.println("ComparableCircle2 is the larger of the two Circles");
        } else if (result > 0) {
            System.out.println("ComparableCircle1 is the larger of the two Circles");
        } else {
            System.out.println("Both circles are equal in size.");
        }
    }
}