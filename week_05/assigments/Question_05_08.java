package week_05.assigments;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter number,name,score. ");
       int numberOfStudents=input.nextInt();
       String nameOfStudent="";
       int scoreOfStudent;
       while (numberOfStudents<0){
           nameOfStudent=input.next();
           scoreOfStudent= input.nextInt();

       }

    }
}