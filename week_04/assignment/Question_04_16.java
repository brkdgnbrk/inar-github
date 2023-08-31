package week_04.assignment;

import java.util.Scanner;

public class Question_04_16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int random=(int)(Math.random()*(90-65+1))+65;
        System.out.println((char)random);
    }
}
