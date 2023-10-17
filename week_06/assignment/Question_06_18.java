package week_06.assignment;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.next();
        if (isValid(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    public static boolean isValid(String password) {
        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'a' &&
                    password.charAt(i) <= 'z' &&
                    password.charAt(i) >= '0' &&
                    password.charAt(i) <= '9') {
                return false;
            }
        }
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                count++;
            }
        }if (count<2){
            return false;
        }
        return true;
    }
}
