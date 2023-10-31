package week_08.assignment;

import java.util.Scanner;

public class Question_08_28 {

    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][] m1 = getValue();
        System.out.print("Enter list2:");
        int[][] m2 = getValue();
        System.out.println("The two arrays are "+((equals(m1,m2))?"":"not ")+"strictly identical");
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i <m1.length ; i++) {
            for (int j = 0; j < m1.length; j++) {
                if (m1[i][j]==m2[i][j]){
                    return false;
                }

            }

        }return true;
    }
    public static int[][]getValue(){
        Scanner input=new Scanner(System.in);
        int[][]matrix=new int[3][3];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                matrix[i][j]=input.nextInt();

            }

        }return matrix;
    }
}
