package week_08.assignment;

import java.util.Scanner;

public class Question_08_26 {
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = getValue();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrixCopy(matrix)[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The row-sorted array is");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(sortRows(matrix)[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static double[][] getValue() {
        Scanner input = new Scanner(System.in);
        double[][] array = new double[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = input.nextDouble();
            }

        }
        return array;
    }

    public static double[][] sortRows(double[][] m) {
        for (int i = 0; i <m.length ; i++) {
            for (int j = 0; j <m.length-1 ; j++) {
                if (m[i][j]>m[i][j+1]){
                    double temp=m[i][j];
                    m[i][j]=m[i][j+1];
                    m[i][j+1]=temp;
                }

            }

        }
    return m;
    }
    public static double[][] matrixCopy(double[][]m){
        double[][]matrixCopy=new double[3][3];
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m.length; j++) {
                matrixCopy[i][j] = m[i][j];

            }
        }
        return matrixCopy;
    }
}