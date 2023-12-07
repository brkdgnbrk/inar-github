package week_11.assignment.question_11_09;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the array size n: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add((int) (Math.random() * 2));
            }
            matrix.add(row);
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
        int maxOnes = 0;
        int rowIndex = -1;
        int colIndex = -1;

        for (int i = 0; i < size; i++) {
            int onesInRow = 0;
            int onesInCol = 0;

            for (int j = 0; j < size; j++) {
                onesInRow += matrix.get(i).get(j);
                onesInCol += matrix.get(j).get(i);
            }

            if (onesInRow > maxOnes) {
                maxOnes = onesInRow;
                rowIndex = i;
            }

            if (onesInCol > maxOnes) {
                maxOnes = onesInCol;
                colIndex = i;
            }
        }

        System.out.println("The largest row index: " + rowIndex);
        System.out.println("The largest column index: : " + colIndex);
    }
}