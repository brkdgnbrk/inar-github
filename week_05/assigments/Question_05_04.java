package week_05.assigments;

public class Question_05_04 {
    public static void main(String[] args) {
       final double MILE_PER_KILOMETER=1.609;
        System.out.println("Miles          Kilometers");
        for (int amount=1;amount<11;amount++){
            System.out.printf("%-10d %10.3f\n",amount,(amount*MILE_PER_KILOMETER));
        }

    }
}
