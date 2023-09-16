package week_05.assigments;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        int computer = (int) (Math.random() * 99) + 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two distinct digits): ");
        int user = input.nextInt();
        if (computer < 10) {
            String str = "0" + computer;
            user = Integer.parseInt(str);
            System.out.println(computer);
        } else if (user < 10) {
            String str = "0" + user;
            user = Integer.parseInt(str);
            System.out.println(user);
        }
        int userDigit1 = user / 10;
        int userDigit2 = user % 10;
        int computerDigit1 = computer / 10;
        int computerDigit2 = computer % 10;

        if (user == computer) {
            System.out.println("The lottery number is " + computer + " \nYou win : $10,000");
        } else if (userDigit1 == computerDigit1 || userDigit1 == computerDigit2 || userDigit2 == computerDigit2 || userDigit2 == computerDigit1) {
            System.out.println("The lottery number is " + computer + " \nMatch one digit: You win $1,000");
        } else if ((userDigit1 == computerDigit1 && userDigit2 == computerDigit2) || (userDigit1 == computerDigit2 && userDigit2 == computerDigit1)) {
            System.out.println("Match all digits: you win $3,000");
        }else {
                System.out.println("The lottery number is " + computer + " \nSorry, no match");

        }
    }
}