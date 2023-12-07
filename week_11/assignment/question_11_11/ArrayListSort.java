package week_11.assignment.question_11_11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of integers ending with 0: ");
        int value;
        do {
            value = input.nextInt();
            if (value != 0 && !list.contains(value)) {
                list.add(value);
            }
        } while (value != 0);
        sort(list);
    }

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {

                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }


        for (Integer list1 : list) {
            System.out.print(list1 + " ");
        }

    }
}

