package week_08.assignment;

import java.util.Scanner;

public class Question_08_24_ {
    public static void main(String[] args) {
        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] sudoku = getValue();
        if (controlRow(sudoku) && controlColumn(sudoku)) {
            System.out.println("True");
        }
    }

    public static int[][] getValue() {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[9][9];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = input.nextInt();
            }

        }
        return array;
    }

    public static boolean controlRow(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length - 1; j++) {
                if (sudoku[i][j] == sudoku[i][j + 1]) {
                    return false;
                }

            }

        }
        return true;
    }

    public static boolean controlColumn(int[][] sudoku) {
        for (int i = 0; i < sudoku[0].length; i++) {
            for (int j = 0; j < sudoku.length - 1; j++) {
                if (sudoku[j][i] == sudoku[j + 1][i]) {
                    return false;
                }

            }

        }
        return true;
    }
}