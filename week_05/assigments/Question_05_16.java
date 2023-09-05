package week_05.assigments;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int i = 2;
        for (i = 2; i <= number;  i++) {
            while (number % i==0) {
                System.out.print(+i);
                number /= i;

                if (number > 1) {
                    System.out.print(", ");
                }
            }

        }


    }
}

