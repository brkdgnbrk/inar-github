package week_11.assignment.question_11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of integers ending with 0: ");
        double value;
        do {
            value = input.nextInt();
            if (value != 0 && !list.contains(value)) {
                list.add(value);
            }
        } while (value != 0);
        System.out.println("Sum of list: "+sum(list));
    }

    public static double sum(ArrayList<Double> list){
        double sum=0;
        for (int i = 0; i < list.size() ; i++) {
            sum+= list.get(i);
        }return sum;
    }
}
