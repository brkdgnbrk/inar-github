package week_05.assigments;

import java.util.Scanner;

public class Question_05_44 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int bits= input.nextInt();
        for (int i = 0; i <bits ; i++) {
            if (bits<0){
                bits=bits^i;
            }

        }

    }
}
