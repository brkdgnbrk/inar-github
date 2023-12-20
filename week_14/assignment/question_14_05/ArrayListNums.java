package week_14.assignment.question_14_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNums {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter integers for ArrayList nums (enter -1 to stop): ");
        ArrayList<Integer>list=new ArrayList<>();
        int value;
        do {
            value= input.nextInt();
            if (value!=-1) {
                list.add(value);
            }
        }while (value!=-1);
        System.out.println(list);
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(0)){
                count++;
                list.remove(i);
            }
        }
        for (int i = 0; i <count ; i++) {
            list.add(0);

        }
        System.out.println(list);
    }
}
