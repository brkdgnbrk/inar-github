package week_11.assignment.question_11_01;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        System.out.print("Enter three side of the triangle: ");
        Scanner input=new Scanner(System.in);
        double side1= input.nextDouble();
        double side2= input.nextDouble();
        double side3= input.nextDouble();
        System.out.print("Enter a color");
        String color= input.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Is the triangle filled (true/false)? "+triangle.isFilled());
        System.out.println("Triangle: side1= "+triangle.getSide1()+" side2= "+triangle.getSide2()+" side3= "+triangle.getSide3());
        System.out.println("Area: "+triangle.getArea());
        System.out.println("Perimeter: "+triangle.getPerimeter());
        System.out.println("Color: "+triangle.getColor());
        System.out.println(triangle.isFilled()?"Triangle is filled.":"Triangle is not filled.");



    }
}
