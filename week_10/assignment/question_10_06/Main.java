package week_10.assignment.question_10_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int NUMBER=120;
        StackOfIntegers stack=new StackOfIntegers();
        isPrimeNumber(NUMBER);
        for (int i = 2; i <120 ; i++) {
            if (isPrimeNumber(i)){
                stack.push(i);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static boolean isPrimeNumber(int number){
        for (int i = 2; i <number/2 ; i++) {
            if (number%i==0){
                return false;
            }
        }return true;
    }

}
