package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list1: ");
        int size1= input.nextInt();
        int[]array1=new int[size1];
        for (int i = 0; i < array1.length; i++) {
            array1[i]=input.nextInt();
        }
        System.out.print("Enter list2: ");
        int size2=input.nextInt();
        int[]array2=new int[size2];
        for (int i = 0; i < array2.length ; i++) {
            array2[i]=input.nextInt();
        }
        System.out.println("The merged list is "+ Arrays.toString(merge(array1,array2)));
    }
    public static int[]merge(int[]list1,int[]list2){
        int[]mergeArray=new int[list1.length+ list2.length];
        for (int i = 0; i <list1.length ; i++) {
            mergeArray[i]=list1[i];

        }
        for (int i = 0; i < list2.length ; i++) {
            mergeArray[list1.length+i]=list2[i];

        }return bubbleSort(mergeArray);
    }
    public static int[] bubbleSort(int[]mergeArray){
        for (int i = 0; i <mergeArray.length-1 ; i++) {
            for (int j = 0; j <mergeArray.length-1-i ; j++) {
                if (mergeArray[j]>mergeArray[j+1]){
                    int temp=mergeArray[j];
                    mergeArray[j]=mergeArray[j+1];
                    mergeArray[j+1]=temp;
                }


            }
        }return mergeArray;
    }
}
