package week_02.assignments;

import java.util.Scanner;

public class Question_02_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder :");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * Math.PI; // double area=radius*radius*PI (Final double PI=3.14)
        System.out.println("The area is " + area);

        double volume = area * length;
        System.out.print("The volume is " + volume);
    }

}
