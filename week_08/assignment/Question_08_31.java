package week_08.assignment;

import java.util.Scanner;

public class Question_08_31 {
    public static void main(String[] args) {
        System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4: ");
        double[][]array=getValue();
        if (getIntersectingPoint(array)==null){
            System.out.println("The two lines are parallel");
        }else {
            System.out.println("The intersecting point is at ("+getIntersectingPoint(array)[0]+", "+getIntersectingPoint(array)[1]+")");
        }
    }
    public static double[] getIntersectingPoint(double[][] points) {
        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];
        double e = (a * points[0][0] - b * points[0][1]);
        double f = (c * points[2][0] - d * points[2][1]);
        double determinant = a * d - b * c;
       if (determinant==0){
           return null;
       }else {
           double x = (e * d - b * f) / determinant;
           double y = (a * f - e * c) / determinant;
           double[]intersection={x,y};
           return intersection;
       }
    }  public static double[][] getValue() {
        Scanner input = new Scanner(System.in);
        double[][] array = new double[4][2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        return array;
    }
}
