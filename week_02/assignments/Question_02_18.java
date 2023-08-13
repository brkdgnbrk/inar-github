package week_02.assignments;

import java.util.Scanner;

public class Question_02_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float a = 1;
        float b = 2;

        System.out.println("a      b      pow(a,b");
        System.out.println("1      2     " + (int) (Math.pow(a, b)));
        System.out.println("2      3     " + (int) (Math.pow(++a, ++b)));
        System.out.println("3      4     " + (int) (Math.pow(++a, ++b)));
        System.out.println("4      5     " + (int) (Math.pow(++a, ++b)));
        System.out.println("5      6     " + (int) (Math.pow(++a, ++b)));

    }
}
