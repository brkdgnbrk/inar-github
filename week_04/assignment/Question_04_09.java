package week_04.assignment;

import java.util.Scanner;

public class Question_04_09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a character: " );
        char ch=input.next().charAt(0);
        int unicodevalue=(int)ch;
        System.out.println("The Unicode for the character "+ch+" is "+unicodevalue);
}

}
