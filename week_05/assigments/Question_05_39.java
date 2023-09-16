package week_05.assigments;

public class Question_05_39 {
    public static void main(String[] args) {
        double commission = 0;
        final double TARGET_AMOUNT = 30000;
        double sales = 0;

        while (commission < TARGET_AMOUNT) {
            sales += 0.01;

            if (sales <= 5000) {
                commission = sales * 0.08;
            } else if (sales <= 10000) {
                commission = 5000 * 0.08 + (sales - 5000) * 0.10;
            } else {
                commission = 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;
            }
        }

        System.out.println("Minimum sales needed to earn $30,000 annually: $" + sales);
    }
}