package week_05.assigments;

public class Question_05_07 {
    public static void main(String[] args) {
        int tuition = 10000;
        int year = 1;
        double tuitionTenthYear = 0;
        double totalCost = 0;
        while (year <= 14) {
            tuition += tuition * 0.05;
            year++;

            if (year == 10) {
                tuitionTenthYear = tuition;
            }
            if (year > 10)
                totalCost = tuition;

        }
        System.out.printf("Tuition is in ten years: %.3f\n", tuitionTenthYear);
        System.out.printf("Total cost for four years' worth of tuition after the tenth year: %.3f", totalCost);
    }

}

