package week_05.assigments;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=input.nextLine();
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if (ch>='A'&&ch<='Z'){
                count++;
            }


        }System.out.println(str+" The number of uppercase letters is "+count);
    }
}
