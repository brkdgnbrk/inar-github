package week_08.assignment;

import java.util.Scanner;

public class Question_08_29 {
    public static void main(String[] args) {
        System.out.print("Enter list1: ");
        int[][] m1 = getValue();
        System.out.print("Enter list2:");
        int[][] m2 = getValue();
        sortArray(m1);
        sortArray(m2);
        System.out.println("The two arrays are " + ((equals(m1, m2)) ? "" : "not ") + "identical");
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }

            }

        }
        return true;
    }

    public static int[][] getValue() {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();

            }

        }
        return matrix;
    }

    public static int[][] sortArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array.length; l++) {
                        if (array[i][j] > array[k][l]) {
                            int temp = array[i][j];
                            array[i][j] = array[k][l];
                            array[k][l] = temp;
                        }

                    }
                }
            }

        }
        return array;
    }
}


