package week_05.assigments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int count1 = 0;
        while (!(Math.abs(count-count1)>2)||!(Math.abs(count1-count)>2)) {
            System.out.print("scissor (0), rock(1), paper(2): ");
         int   computer = (int) (Math.random() * 3);
          int  user = input.nextInt();
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
                    break;
            }
            System.out.print(" You are ");
            switch (user) {
                case 0:
                    System.out.print("scissor");
                    break;
                case 1:
                    System.out.print("rock");
                    break;
                case 2:
                    System.out.print("paper");
                    break;
            }
            if (user == computer) {
                System.out.println(" too. , It is a draw");
                count++;
                count1++;
                System.out.println(" Computer wins: "+count1);
                System.out.println(" User wins: "+count);
            } else {
                boolean win = (user == 0 && computer == 2) ||
                        (user == 1 && computer == 0) ||
                        (user == 2 && computer == 1);
                if (win) {
                    System.out.println(" You win");
                    count++;
                    System.out.println("Computer wins: "+count1);
                    System.out.println("User wins: "+count);
                } else {
                    System.out.println(" You lose");
                    count1++;
                    System.out.println("Computer wins: "+count1);
                    System.out.println("User wins: "+count);
                }
            }
        }
    }
}