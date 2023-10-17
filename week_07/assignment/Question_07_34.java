package week_07.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to sort: ");
        String str = input.nextLine();
        System.out.println("sorted from: "+sort(str));
    }

    public static String sort(String s) {
        int[] intArray = new int[s.length()];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (s.charAt(i));
        }
        for (int i = 0; i < intArray.length; i++) {
            int currentMin = intArray[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < intArray.length; j++) {
                if (currentMin > intArray[j]) {
                    currentMin = intArray[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex!=i){
                intArray[currentMinIndex]=intArray[i];
                intArray[i]=currentMin;
            }
        }String resultString="";
        for (int i = 0; i <intArray.length ; i++) {
            resultString+=(char)(intArray[i]);
        }return resultString;
    }
}
