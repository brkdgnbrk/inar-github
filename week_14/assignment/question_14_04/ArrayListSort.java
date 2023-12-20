package week_14.assignment.question_14_04;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size1 'n' for ArrayList A: ");
        int size1= input.nextInt();
        System.out.println("Enter "+ size1+" Integers for ArrayList A: ");
        ArrayList<Integer>listA=new ArrayList<>();
        for (int i = 0; i <size1 ; i++) {
            int value= input.nextInt();
            listA.add(value);
        }
        ArrayList<Integer>listB=new ArrayList<>();
        System.out.print("Enter the size1 'n' for ArrayList B: ");
        int size2= input.nextInt();
        System.out.println("Enter "+ size2+" Integers for ArrayList B: ");
        for (int i = 0; i <size2 ; i++) {
            int value= input.nextInt();
            listB.add(value);
        }
        Collections.sort(listA);
        System.out.println(listA);
        System.out.println();
        Collections.sort(listB,Collections.reverseOrder());
        System.out.println(listB);
        System.out.println();
        System.out.print("Merged and sorted ArrayList C:");
        ArrayList<Integer>listC=new ArrayList<>(listA);
        for (int i = 0; i <listB.size() ; i++) {
            listC.add(listB.get(i));
        }
        System.out.println();
        System.out.println(listC);


    }
}
