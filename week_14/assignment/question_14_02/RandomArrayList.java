package week_14.assignment.question_14_02;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(100) + 1;
            list.add(randomNumber);
        }
        System.out.print(list);

        for (int i = 0; i < list.size() ; i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if (list.get(i).equals(list.get(j))){
                    list.remove(i);
                }
            }
        }
        System.out.println();
        System.out.print(list);
    }


}
