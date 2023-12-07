package week_12.assignment.question_12_05__;

import week_11.assignment.question_11_01.Triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Is the triangle filled (true/false)? " + triangle.isFilled());
        System.out.println("Triangle: side1= " + triangle.getSide1() + " side2= " + triangle.getSide2() + " side3= " + triangle.getSide3());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());


    }
}
