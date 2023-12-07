package week_12.assignment.question_12_03;

import java.util.Scanner;

public class ArrayException extends ArrayIndexOutOfBoundsException{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]array=new int[100];
        filledArray(array);
        try {
            System.out.print("Enter the index of the array: ");
           int index= input.nextInt();
            System.out.println("You chose: "+array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds.!!");
            input.nextLine();
        }

    }
    public static int[] filledArray(int[]array){
        for (int i = 0; i <array.length ; i++) {
            array[i]=(int)(Math.random()*100);

        }return array;
    }
}
