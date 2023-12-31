package week_10.assignment.question_10_07;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }
        //For choices
        int choice = 0;

        while (true) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            if (id < 0 || id > 9) {
                System.out.println("Invalid Id..Please enter between 0-9 ");
            } else {
                while (true) {
                    displayMenu();
                    choice = input.nextInt();
                    if (choice == 1) {
                        displayBalance(accounts[id]);
                        System.out.println();
                    } else if (choice == 2) {
                        accounts[id].withdraw(promptWithdrawAmount(accounts[id], input));
                        System.out.println();
                    } else if (choice == 3) {
                        accounts[id].deposit(promptDepositAmount(input));
                        System.out.println();
                    } else if (choice == 4) {
                        break;
                    } else {
                        System.out.println("Invalid choice");
                    }
                }
            }
        }
    }

    public static void displayMenu() {
        System.out.print("Main menu\n" +
                "1: check balance\n" +
                "2: withdraw\n" +
                "3: deposit\n" +
                "4: exit\n" +
                "Enter a choice: ");
    }

    public static void displayBalance(Account accounts) {
        System.out.print("The balance is: " + accounts.getBalance());
    }

    public static int promptWithdrawAmount(Account accounts, Scanner input) {
        System.out.print("Enter an amount to withdraw: ");
        int amount = input.nextInt();

        if (amount > accounts.getBalance()) {
            System.out.println("No enough money.You cant withdraw");
            return 0;
        }
        return amount;
    }

    public static int promptDepositAmount(Scanner input) {
        System.out.print("Enter the amount to deposit: ");
        int amount = input.nextInt();
        if (amount < 0) {
            System.out.println("You cant deposit negative(-) value...");
            return 0;
        }
        return amount;

    }
}