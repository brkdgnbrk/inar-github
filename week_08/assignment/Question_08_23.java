package week_08.assignment;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        System.out.println("Enter a 6-by-6 matrix row by row:");
        int[][] array = getValue();
        display(array);
       int changeRow= findChangeRow(array);
       int changeColumn= findChangeColumn(array);
        System.out.println(
                "The flipped cell is at (" + changeRow + ", " + changeColumn + ")");
    }

    public static void display(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static int[][] getValue() {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                array[i][j]=input.nextInt();
            }
        }return array;
    }
    public static int findChangeRow(int[][]array){
        int sum=0;
        int j=0;
        for (int i = 0; i < array.length ; i++) {
            sum=0;
            for (j = 0; j < array.length ; j++) {
                sum+=array[i][j];

            }
            if (sum%2!=0){
                return i;
            }

        }return -1;
    }
    public static int findChangeColumn(int[][]array){
        int sum=0;
        int j=0;
        for (int i = 0; i < array.length ; i++) {
            sum=0;
            for (j = 0; j < array.length ; j++) {
                sum+=array[j][i];

            }
            if (sum%2!=0){
                return i;
            }

        }return -1;
    }
}