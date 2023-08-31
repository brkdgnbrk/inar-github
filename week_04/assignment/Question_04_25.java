package week_04.assignment;

import java.util.Scanner;

public class Question_04_25 {
    public static void main(String[] args) {
        int number0 = (int) (Math.random() * (91 - 65)) + 65;
        int number1 = (int) (Math.random() * (91 - 65)) + 65;
        int number2 = (int) (Math.random() * (91 - 65)) + 65;


        char ch1 = (char) number0;
        char ch2 = (char) number1;
        char ch3 = (char) number2;
        int number4 = (int) (Math.random() * (9999 - 1000) + 1) + 1000;
        System.out.println("" + ch1 + ch2 + ch3 + number4)
        ;


    }
}
