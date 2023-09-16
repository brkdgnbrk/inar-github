package week_05.live_class;

import java.util.Scanner;

public class live_class2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        int pow = number.length();
        double total = 0;
        for (int i = 0; i < pow; i++) {
            int num1 = Integer.parseInt(number.charAt(i) + "");
            double multi = Math.pow(num1, pow);
            total += multi;
        }
        String numbers = total + "";
        if (numbers.equals(number)) {
            System.out.println("The number is amstrong");
        } else {
            System.out.println("The number is not amstrong");
        }


    }
}
