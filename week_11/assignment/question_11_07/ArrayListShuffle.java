package week_11.assignment.question_11_07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListShuffle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> listShuffle = new ArrayList<>();
        System.out.println("Enter a list of integers ending with 0: ");
        int value;
        do {
            value = input.nextInt();
            if (value != 0 && !listShuffle.contains(value)) {
                listShuffle.add(value);
            }
        } while (value != 0);
        ArrayListShuffle arrayListShuffle = new ArrayListShuffle();
        ArrayList<Integer> shuffledList = arrayListShuffle.shuffle(listShuffle);

        System.out.println("Shuffled List: " + shuffledList);
    }
    public ArrayList<Integer> shuffle(ArrayList<Integer>listShuffle){
        for (int i = listShuffle.size() - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (listShuffle.size()));

            int temp = listShuffle.get(i);
            listShuffle.set(i, listShuffle.get(randomIndex));
            listShuffle.set(randomIndex, temp);
        }

        return listShuffle;
    }
}

