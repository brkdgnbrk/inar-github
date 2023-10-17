package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[]numbers=new double[10];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=input.nextDouble();
        }
        System.out.print(Arrays.toString(selectionSort(numbers)));
    }
    public static double[] selectionSort(double[]numbers){
        for (int i = numbers.length-1; i >= 0 ; i--) {
            double currentMax=numbers[i];
            int currentMaxIndex=i;
            for (int j = i-1; j >= 0 ; j--) {
                if (currentMax<numbers[j]){
                    currentMax=numbers[j];
                    currentMaxIndex=j;
                }
            }
            if (currentMaxIndex!=i){
                numbers[currentMaxIndex]=numbers[i];
                numbers[i]=currentMax;
            }
        }
     return numbers;
    }
}
