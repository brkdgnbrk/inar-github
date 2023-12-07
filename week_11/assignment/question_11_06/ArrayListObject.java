package week_11.assignment.question_11_06;

import java.util.ArrayList;

import week_11.assignment.question_11_06.Loan;

import java.util.Date;

import week_10.assignment.question_10_11.Circle2D;

public class ArrayListObject {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("String Expression");
        list.add(new Date());
        list.add(new Loan(2.5, 1, 1000));
        list.add(new Circle());
        for (int i = 0; i < list.size(); i++) {
            System.out.println((list.get(i)).toString() + "\n");

        }
    }
}