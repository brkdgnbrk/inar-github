package week_14.assignment.question_14_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            list.add(randomNumber);
        }
        System.out.print(list);
        Collections.reverse(list);
        System.out.println();
        System.out.print(list);

    }
}
