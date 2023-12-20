package week_14.assignment.question_14_06;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        ArrayList<Integer> removedEvenNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            list.add(randomNumber);
        }

        System.out.println("Original List: " + list);

        int i = 0;
        while (i < list.size()) {
            int num = list.get(i);
            if (num % 2 == 0) {
                removedEvenNumbers.add(num);
                list.remove(i);
            } else {
                i++;
            }
        }

        list.addAll(removedEvenNumbers);

        System.out.println("Rearranged List: " + list);
    }
}
