package week_03.assignments;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotteryNumber = (int) (Math.random() * 900)+100;
        System.out.print("Enter your lotter pick (three digits): ");
        int user = input.nextInt();
        int digitUser1 = user % 10;
        int digitUser2 = (user / 10) % 10;
        int digitUser3 = user / 100;

        int lotteryNumberDigit1 = lotteryNumber % 10;
        int lotteryNumberDigit2 = (lotteryNumber / 10) % 10;
        int lotteryNumberDigit3 = lotteryNumber / 100;

        System.out.println("The lottery number is " + lotteryNumber);
        if (lotteryNumber == user) {

            System.out.println("Exact match: you win $10.000 ");
        } else if ((digitUser1 == lotteryNumberDigit1 || digitUser1 == lotteryNumberDigit2 || digitUser1 == lotteryNumberDigit3)
                && (digitUser2 == lotteryNumberDigit1 || digitUser2 == lotteryNumberDigit2 || digitUser2 == lotteryNumberDigit3)
                && (digitUser3 == lotteryNumberDigit1 || digitUser3 == lotteryNumberDigit2 || digitUser3 == lotteryNumberDigit3)) {
            System.out.println("All digits match: you win $3,000!");
        } else if (digitUser1 == lotteryNumberDigit1 || digitUser2 == lotteryNumberDigit2 || digitUser3 == lotteryNumberDigit3
                || digitUser1 == lotteryNumberDigit2 || digitUser1 == lotteryNumberDigit3 || digitUser2 == lotteryNumberDigit1
                || digitUser2 == lotteryNumberDigit3 || digitUser3 == lotteryNumberDigit1 || digitUser3 == lotteryNumberDigit2) {
            System.out.println("Matched one number!!! you win $1,000!");
        } else {
            System.out.println("Sorry, no match :(");
        }
    }

}