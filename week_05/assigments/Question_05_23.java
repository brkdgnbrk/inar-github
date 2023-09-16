package week_05.assigments;

public class Question_05_23 {
    public static void main(String[] args) {
        double leftToRight = 0.0;
        for (double i = 1.0; 50000.0 >= i; i++) {
            leftToRight += 1 / i;

        }
        System.out.println("Summation of series right to left: " + leftToRight);
        double rightToLeft = 0.0;
        for (double i = 50000.0; i >= 1.0; i--) {
            rightToLeft += 1 / i;

        }
        System.out.println("Summation of series right to left: " + rightToLeft);

        System.out.println("Summation of the series right to left - "
                + "Summation of the series left to right: "
                + (rightToLeft - leftToRight));
    }
}
