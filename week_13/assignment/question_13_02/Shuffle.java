package week_13.assignment.question_13_02;

import java.util.ArrayList;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<Number>list=new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add(10);
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);
        System.out.println(list.toString());
        shuffle(list);
        System.out.println(list);

    }
    public static void shuffle(ArrayList<Number>list){
        java.util.Collections.shuffle(list);

    }
}
