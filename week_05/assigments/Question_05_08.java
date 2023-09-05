package week_05.assigments;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
       int numberOfStudents=input.nextInt();
        System.out.print("Enter each student's name and score  ");
       String nameOfStudent="";
       int scoreOfStudent=0;
       int studentCount=0;
       int highestScore = 0;
       String highestScoreName="";
       while (numberOfStudents>0){
           nameOfStudent=input.next();
           scoreOfStudent= input.nextInt();
            studentCount++;
           numberOfStudents--;
           System.out.println("Student: "+studentCount+"\n    Name: "+nameOfStudent+"\n    Score: "+scoreOfStudent);

       if (scoreOfStudent>highestScore){
           highestScore=scoreOfStudent;
           highestScoreName=nameOfStudent;
        }
       }System.out.println("Student with the highest score: " + highestScoreName);


    }
}