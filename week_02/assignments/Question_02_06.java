package week_02.assignments;

import java.util.Scanner;

public class Question_02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number between 0 and 1000: ");
        int number=input.nextInt();

        int digit1=number%10;
        int restNumber1=number/10;
        int digit2=restNumber1%10;
        int digit3=restNumber1/10;
        int digitSum=digit1+digit2+digit3;


        System.out.println("The sum of the digits is " + digitSum);

    }
}
