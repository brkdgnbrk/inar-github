package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[]numbers=new double[10];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=input.nextDouble();
        }
        System.out.println(Arrays.toString(bubbleSort(numbers)));
    }
    public static double[] bubbleSort(double[]numbers){
        for (int i = 0; i < numbers.length-1 ;i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                if (numbers[i]>numbers[j]){
                    double temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }return numbers;

    }
}
