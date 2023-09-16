package week_05.assigments;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstStr = input.nextLine();
        System.out.print("Enter the second string: ");
        String secondStr = input.nextLine();
        String str="";
        int i=0;
        while (firstStr.charAt(i)==secondStr.charAt(i)){
                str+=firstStr.charAt(i);
                i++;
        }if (str.length()>0){
            System.out.println("The commmon prefix is " + str);
        }else {
            System.out.println(firstStr + " and " + secondStr + " have no commmon prefix");
        }

    }
}
