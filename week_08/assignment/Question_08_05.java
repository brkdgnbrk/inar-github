package week_08.assignment;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        double[][]matrix1=new double[3][3];
        for (int i = 0; i <matrix1.length ; i++) {
            for (int j = 0; j < matrix1[0].length ; j++) {
                matrix1[i][j]=input.nextDouble();
            }
        }
        System.out.print("Enter matrix2 ");
        double[][]matrix2=new double[3][3];
        for (int i = 0; i <matrix2.length ; i++) {
            for (int j = 0; j < matrix2[0].length ; j++) {
                matrix2[i][j]=input.nextDouble();
            }
        }
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            if (i == 1) {
                System.out.print(" +  ");
            } else {
                System.out.print("    ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            if (i == 1) {
                System.out.print(" =  ");
            } else {
                System.out.print("    ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(addMatrix(matrix1,matrix2)[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][]addMatrix(double[][]a,double[][]b){
        double[][]addedMatrix=new double[a.length][b.length];
        for (int i = 0; i <addedMatrix.length ; i++) {
            for (int j = 0; j < addedMatrix[0].length ; j++) {
                addedMatrix[i][j]+=a[i][j]+b[i][j];

            }

        }return addedMatrix;
    }
}
