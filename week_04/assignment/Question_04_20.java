package week_04.assignment;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str=input.nextLine();
        int strLength=str.length();
        char firstCh=str.charAt(0);
        System.out.println("Length of the string: "+strLength);
        System.out.println("First haracter of the string: "+firstCh);


    }
}
