package week_09.assignment.question_09_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        double discriminant= quadraticEquation.getDiscriminant();
        if (discriminant>0){
            System.out.printf("The equation has two roots %2f and %2f",quadraticEquation.getRoot1(),quadraticEquation.getRoot2());
        } else if (discriminant==0) {
            System.out.printf("The equation has one root %2f",quadraticEquation.getRoot1());

        }else {
            System.out.println("The equation has no real roots");
        }

    }
}
