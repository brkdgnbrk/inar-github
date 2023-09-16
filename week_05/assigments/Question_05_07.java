package week_05.assigments;

public class Question_05_07 {
    public static void main(String[] args) {
        int sum = 10000;
        for (int i = 1; i < 11; i++) {
            sum += sum * 0.05;
            int sum1 = sum;
        }
        System.out.println("Tuition in ten years: $" + sum);
        int totalCost = 0;
        for (int i = 0; i < 4; i++) {
            sum += sum * 0.05;
            totalCost += sum;

        }
        System.out.println("Total cost for four years' worth of tuition after the tenth year: $" + totalCost);
    }
}
