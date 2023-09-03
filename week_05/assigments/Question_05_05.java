package week_05.assigments;

public class Question_05_05 {
    public static void main(String[] args) {
        final double POUND_PER_KILOGRAM=2.2;
        System.out.println("Kilograms  Pounds    |   Pounds     Kilograms");
        int count;
        int amount;
        for (count=1,amount=20;count<=199&&amount<=515;count+=2,amount+=5) {
            System.out.printf("%-10d %6.1f    |    %5d %10.2f\n", count, (count*POUND_PER_KILOGRAM), amount, (amount/POUND_PER_KILOGRAM));
        }
    }
}
