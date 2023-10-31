package week_08.assignment;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {
        System.out.print("Enter x1,y1,x2,y2,x3,y3: ");
        double[][] array = getValue();
        double area=getTriangleArea(array);
        if (area == 0) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.println("The area of the triangle is " +area);
        }

    }

    public static double[][] getValue() {
        Scanner input = new Scanner(System.in);
        double[][] array = new double[3][2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        return array;
    }

    public static double getTriangleArea(double[][] points) {
        double side1 = Math.sqrt(Math.pow((points[1][0] - points[0][0]), 2) + Math.pow((points[1][1] - points[0][1]), 2));
        double side2 = Math.sqrt(Math.pow((points[2][0] - points[0][0]), 2) + Math.pow((points[2][1] - points[0][1]), 2));
        double side3 = Math.sqrt(Math.pow((points[2][0] - points[1][0]), 2) + Math.pow((points[2][1] - points[1][1]), 2));
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
return area;
    }
}

