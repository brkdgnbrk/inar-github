package week_11.assignment.question_11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCombine {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integers for list1");
        for (int i = 0; i < 5; i++) {
            list1.add(i, input.nextInt());
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter five integers for list2");
        for (int i = 0; i < 5; i++) {
            list2.add(i, input.nextInt());
        }
        System.out.println("The combined list is ");
        for (Integer listt:union(list1,list2)) {
            System.out.print(listt+"  ");
        }

    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> listCombine = new ArrayList<>();
        for (int i = 0; i <list1.size() ; i++) {
            listCombine.add(i,list1.get(i));
        }
        for (int i =0,j=list1.size(); i <list2.size() ; i++,j++) {
            listCombine.add(j,list2.get(i));

        }return listCombine;
    }
}
