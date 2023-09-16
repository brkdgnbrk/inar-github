package week_05.assigments;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=input.nextLine();
        String str1="";

        for (int i = 0; i <str.length() ; i++) {
            char temp=str.charAt(i);
            str1=temp+str1;
        }
        System.out.println(str1);
    }
}
