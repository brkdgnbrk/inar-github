package week_14.assignment.question_14_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
int randomInt=random.nextInt(10);
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            list.add(randomNumber);
        }
        System.out.println("Generated List: " + list);
        Collections.sort(list);
        System.out.println();
        System.out.println(list);
        System.out.println("What is the "+(randomInt+1)+". greatest number\n");
        System.out.println("The "+(randomInt+1)+"th largest element is: "+list.get(randomInt));
    }
}
