package week_11.assignment.question_11_10;

import java.util.ArrayList;
import java.util.Scanner;


public class TestMystack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack myStack=new MyStack();
        System.out.println("Enter five string: ");
        for (int i = 0; i < 5; i++) {
            int number= input.nextInt();
            myStack.push(number);
        }
        System.out.println(myStack.toString());
        ArrayList<Object> stackList = new ArrayList<>();
        for (int i = 0; i < myStack.getSize() ; i++) {
            stackList.add(myStack.getList().get(myStack.getSize() - 1 - i));


        }
        System.out.println(stackList);
    }

}
