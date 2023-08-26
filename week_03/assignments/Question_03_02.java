package week_03.assignments;

import java.util.Scanner;
import java.util.concurrent.ConcurrentSkipListSet;

public class Question_03_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);
        int number3 = (int) (Math.random() * 10);

        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
        int result = input.nextInt();
        System.out.println(number1 + " + " + number2 + " + " + number3 + " == " + result + " is " + (number1 + number2 + number3 == result));


    }
}
