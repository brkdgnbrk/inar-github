package week_05.assigments;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int max = input.nextInt();
        int count = 0;
        int number=0;
        while (true) {
            number = input.nextInt();
            if (number==0){
                break;
            }
            if (number > max) {
                max = number;
                count = 0;
            }
            if (number == max)
                count++;
        }

        System.out.println("The largest number is " + max);
        System.out.println(
                "The occurrence count of the largest number is " + count);
    }
}