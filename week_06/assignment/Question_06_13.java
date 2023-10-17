package week_06.assignment;

public class Question_06_13 {
    public static void main(String[] args) {
        System.out.println("i          m(i)");
        System.out.println("--------------------");
        for (double i=1.0;i<=20.0;i++) {
            System.out.printf("%-10.0f", i);
            System.out.printf("%7.4f\n", sumSeries(i));
        }
    }

    public static double sumSeries(double number) {
        double sum = 0;
        for (double i = 1; i <= number; i++) {
            sum += i / (i + 1);

        }return sum;

    }
}
