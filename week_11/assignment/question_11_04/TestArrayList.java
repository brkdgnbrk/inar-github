package week_11.assignment.question_11_04;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers ending with 0: ");
        int value;
        do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0)
            list.add(value);

        } while (value != 0);
        System.out.print("The largest number in the list is "+max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        int max = 0;
        if (list.isEmpty() || list.contains(null)) {
            return null;
        } else {
            for (int i = 0; i < list.size() - 1; i++) {

                if (list.get(i) > list.get(i + 1)) {
                    max = list.get(i);
                }
            }
        }return max;
    }
}
