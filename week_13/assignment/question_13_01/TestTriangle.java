package week_13.assignment.question_13_01;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        System.out.print("Enter three side of the triangle: ");
        Scanner input=new Scanner(System.in);
        double side1= input.nextDouble();
        double side2= input.nextDouble();
        double side3= input.nextDouble();
        System.out.print("Enter a color ");
        String color= input.next();
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();

        Triangle triangle=new Triangle(color,filled,side1,side2,side3);
        System.out.println(triangle);



    }
}
