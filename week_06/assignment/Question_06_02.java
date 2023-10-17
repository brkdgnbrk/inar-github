package week_06.assignment;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        long user=input.nextLong();
        long n = sumDigits(user);
        System.out.println("The sum of digit in "+user+" is "+n);


    }

    public static int sumDigits(long n) {
        int sum=0;
        while (n > 0) {
             sum += (int) n % 10;
            n=n/10;

        }return sum;
    }
}