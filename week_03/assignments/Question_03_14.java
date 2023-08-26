package week_03.assignments;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computer = (int) (Math.random() * 2);
        System.out.println("Guess the flip of coin (0 represent head 1 represent tail):");
        int user = input.nextInt();
        if (user == 1 || user == 0) {
            if (user == computer) {
                System.out.println("Your guess is correct");
            } else {
                System.out.println("Your guess is incorrect");
            }
        } else {
            System.out.println("Invalid value!");
        }
    }
}