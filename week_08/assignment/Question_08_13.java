package week_08.assignment;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows and olumns of the array: ");
        int arraySizeRow= input.nextInt();
        int arraySizeColumn= input.nextInt();
        double[][]numbersArray=new double[arraySizeRow][arraySizeColumn];
        System.out.println("Enter the array: ");
        for (int i = 0; i <numbersArray.length ; i++) {
            for (int j = 0; j <numbersArray[0].length ; j++) {
                numbersArray[i][j]=input.nextDouble();
            }

        }
        System.out.println("The location of the largest element is at ("+locateLargest(numbersArray)[0]+", "+locateLargest(numbersArray)[1]+")");

    }

    public static int[] locateLargest(double[][] a){
        double largestElement=a[0][1];
        int[] rowAndColumn=new int[2];
        int row=0;
        int column=0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[0].length ; j++) {
                if (a[i][j]>largestElement) {
                    largestElement=a[i][j];
                    rowAndColumn[0]=i;
                    rowAndColumn[1]=j;


                }
            }

        }return rowAndColumn;
    }
}
