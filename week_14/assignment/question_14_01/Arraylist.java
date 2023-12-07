package week_14.assignment.question_14_01;

import java.util.ArrayList;
import java.util.Random;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Random random=new Random();
        int randomNumber=random.nextInt(100)+1;
        for (int i = 0; i < 10 ; i++) {
            list.add(randomNumber);
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i)+",");

        }
    }
}
