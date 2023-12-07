package week_11.assignment.question_11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDistinct {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers");
        for (int i = 0; i < 10; i++) {
            list.add(i, input.nextInt());
        }
        removeDuplicate(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if ((list.get(i) == list.get(j))) {
                    list.remove(i);
                    j--;
                }

            }

        }
        System.out.print("The distinct integers are ");
        for (Integer list11 : list) {
            System.out.print(list11 + " ");
        }
    }
}
