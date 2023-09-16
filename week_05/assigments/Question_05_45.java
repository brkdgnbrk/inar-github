package week_05.assigments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double average=0;
        double number;
        double standartDeviation=0;
        for (int i = 1; i <11 ; i++) {
            number=input.nextDouble();
            average+=number;
            standartDeviation+=Math.pow(number,2);
        }
        standartDeviation=Math.sqrt((standartDeviation-(Math.pow(average,2)/10))/9);
        average/=10;
        System.out.println(standartDeviation);
    }
}
