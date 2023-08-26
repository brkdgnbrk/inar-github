package week_03.assignments;

import java.util.Scanner;
public class Question_03_34 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double pointPosition = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);


    }
}
