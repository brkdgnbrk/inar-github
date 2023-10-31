package week_08.assignment;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        double[][]array=getValue();
        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(array));

    }
    public static double sumMajorDiagonal(double[][]m){
        double sumMajorDiagonal=0;
            for (int j = 0; j <m.length ; j++) {
            sumMajorDiagonal+=m[j][j];
            }return sumMajorDiagonal;
    }
    public static double[][]getValue(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row");
        double[][]result=new double[4][4];
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result.length ; j++) {
                result[i][j]=input.nextDouble();
            }
        }return result;
    }
}
