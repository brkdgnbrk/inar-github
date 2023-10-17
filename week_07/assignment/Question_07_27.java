package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeArray = input.nextInt();
        int[] list1 = new int[sizeArray];
        int[] list2 = new int[sizeArray];
        System.out.print("Enter list1: ");
        sort(getArray(list1));
        System.out.print("Enter list2: ");
        sort(getArray(list2));
        System.out.println((equals(list1, list2)) ? "Two lists are identical" : "Two lists are not identical");
    }

    public static int[] getArray(int list[]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;
    }
    public static int[]sort(int[]list){
        for (int i = 1; i < list.length ; i++) {
            if (list[i-1]>list[i]){
                int temp=list[i-1];
                list[i-1]=list[i];
                list[i]=temp;
            }
        }return list;
    }

}


