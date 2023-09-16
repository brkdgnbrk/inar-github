package week_05.live_class;

import java.util.Scanner;

public class live_class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int pow = input.nextInt();
        int sum = 1;
        for (int i = 1; i <= pow; i++) {
            sum *= base;

        }
        System.out.println(sum);
    }
}