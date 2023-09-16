package week_05.assigments;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the commission sought (e.g., 30000): ");
        double COMMISSION_SOUGHT = input.nextDouble();

        double commission = 0;
        double sales = 0;

        for (double i = 1; commission < COMMISSION_SOUGHT; i += 0.01) {
            sales = i;

            if (sales <= 5000) {
                commission = sales * 0.08;
            } else if (sales <= 10000) {
                commission = 5000 * 0.08 + (sales - 5000) * 0.10;
            } else {
                commission = 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;
            }
        }

        System.out.println("Minimum sales needed to earn $" + COMMISSION_SOUGHT + " annually: $" + sales);
    }
}