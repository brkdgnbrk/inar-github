package week_07.assignment;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        double[]numbers=new double[10];
        System.out.println("The minimum number is "+min(getFillArray(numbers))+" index "+indexOfSmallestElement(numbers));

    }
    public static int indexOfSmallestElement(double[] array){
        double min=array[0];
        int count=0;
        for (int i = 0; i <array.length ; i++) {
            if (min>array[i]){
                min=array[i];
                count=i;
            }
        }return count;

    }
    public static double[] getFillArray(double[]array){
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <array.length ; i++) {
            array[i]=input.nextDouble();
        }return array;
    }
    public static double min(double[] array){
        double min=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (min>array[i]){
                min=array[i];
            }
        }return min;
    }
}
