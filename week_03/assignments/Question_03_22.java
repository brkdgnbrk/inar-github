package week_03.assignments;

import java.util.Scanner;

public class Question_03_22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double point1=input.nextDouble();
        double point2=input.nextDouble();

        double distance=Math.pow(Math.pow(point1,2)+Math.pow(point2,2),0.5);
        if (distance>10){
            System.out.println("Point ("+point1+","+point2+") is not in the circle");
        }else if (distance<=10){
            System.out.println("Point ("+point1+","+point2+") is in the circle");
        }



    }
}
