package week_05.assigments;

public class Question_05_03 {
    public static void main(String[] args) {
        final double POUND_PER_ONE_KILOGRAM=2.2;
        final int TOTAL_NUMBER=200;
        int count;
        System.out.println("Kilograms          Pounds");
        for (count=1;TOTAL_NUMBER>count;count+=2){
            System.out.printf("%-10d%15.1f\n",count,(count*POUND_PER_ONE_KILOGRAM));
        }

    }
}
