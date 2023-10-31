package week_08.assignment;

import java.util.Scanner;

public class Question_08_33 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[][]coordinates=new double[4][2];
        System.out.println("Enter x1,y1,x2,y2,x3,y3,x4,y4:");
        for (int i = 0; i <coordinates.length ; i++) {
            for (int j = 0; j <coordinates[0].length ; j++) {
                coordinates[i][j]=input.nextDouble();

            }

        }


    }

}