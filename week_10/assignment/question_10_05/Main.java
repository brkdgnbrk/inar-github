package week_10.assignment.question_10_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        StackOfIntegers stackOfIntegers = new StackOfIntegers();

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                stackOfIntegers.push(i);
                number /= i;
            }


        }
        stackOfIntegers.push(number);

        while (!stackOfIntegers.empty()) {
            System.out.print(stackOfIntegers.pop() + " ");
        }
        System.out.println();
    }
}