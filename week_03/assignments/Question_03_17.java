package week_03.assignments;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();
        if(user<0||user>2){
            System.out.println("İnvalid input. Please enter (0,1,2) ");
            System.exit(1);
        }
        int computer = (int) (Math.random() * 3);

        System.out.print("The computer is ");
        switch (computer) {
            case 0:
                System.out.print("scissor.");
                break;
            case 1:
                System.out.print("rock.");
                break;
            case 2:
                System.out.print("paper.");

        }

        System.out.print("You are ");
        switch (user) {
            case 0:
                System.out.print("scissor");
                break;
            case 1:
                System.out.print("rock");
                break;
            case 2:
                System.out.print("paper");
        }

        if (computer == user) {
            System.out.print(" too. It is a draw");
        } else {
            boolean win = (user == 0 && computer == 2) ||
                    (user == 1 && computer == 0) ||
                    (user == 2 && computer == 1);
            if (win) {
                System.out.print(". You win");
            } else {
                System.out.print(". You lose");
            }

        }

    }
}