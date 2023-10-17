package week_06.assignment;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println("SalesAmount       Commission");
        System.out.println("-------------------------------");
        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%-12d    %10.1f\n",i,computeCommission(i));

        }


    }

    public static double computeCommission(double salesAmount) {
        if (salesAmount<=10000) {
            return 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        } else {
            return 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;

        }


    }
}
