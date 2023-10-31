package week_08.assignment;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][]matrix = getValue();
        System.out.println((isMarkovMatrix(matrix))?"It is a Markov matrix":"It is not a Markov matrix");
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
    public static boolean isMarkovMatrix(double[][] m){
        double sumColumn=0;
        for (int i = 0; i < m.length ; i++) {
            sumColumn=0;
            for (int j = 0; j < m[0].length ; j++) {
                sumColumn+=m[j][i];
                if (m[i][j]<0){
                    return false;
                }

            }
            if (sumColumn!=1){
                return false;
            }

        }return true;
    }
}