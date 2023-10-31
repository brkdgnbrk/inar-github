package week_08.assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question_08_16 {
    public static void main(String[] args) {
        int[][] array = {
                {4, 2},
                {1, 7},
                {4, 5},
                {1, 2},
                {1, 1},
                {4, 1}
        };

        sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }System.out.println();

    }

    public static void sort(int m[][]) {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m.length - i-1; j++) {
                if (m[j][0] > m[j + 1][0]) {
                    int[] temp = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = temp;
                }
            }

        }
        for (int col = 0; col < m[0].length; col++) {
            for (int i = 0; i < m.length - 1; i++) {
                for (int j = 0; j < m.length - i - 1; j++) {
                    if (m[j][col] > m[j + 1][col]) {
                        int temp = m[j][col];
                        m[j][col] = m[j + 1][col];
                        m[j + 1][col] = temp;
                    }
                }
            }
        }
    }

}