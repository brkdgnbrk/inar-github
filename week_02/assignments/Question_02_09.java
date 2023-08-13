package week_02.assignments;

import java.util.Scanner;

public class Question_02_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0 , v1  and t: ");

        double velocity0 = input.nextDouble();
        double velocity1 = input.nextDouble();

        double time = input.nextDouble();

        double averageAcceleration = (velocity1 - velocity0) / time;

        System.out.print("The average acceleration is " + averageAcceleration);
    }
}
