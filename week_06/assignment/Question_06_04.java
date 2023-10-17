package week_06.assignment;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Display an integer reversed:");
        System.out.print("Enter an integer: ");
        int number= input.nextInt();
        reverse(number);

    }



    public static void reverse(int number){
        String numString=number+"";
        String numString1="";
        for (int i = numString.length()-1; 0 <=i ; i--) {
            char chr=numString.charAt(i);
            numString1=chr+"";
            System.out.print(numString1);
        }

    }
}
