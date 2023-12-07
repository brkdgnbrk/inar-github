package week_13.assignment.question_13_08;



public class TestClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack myStack1=new MyStack();
        System.out.println("Pushing the number 4,5 and 6 to 1st stack... ");
        myStack1.push(4);
        myStack1.push(5);
        myStack1.push(6);
        System.out.println("Cloning 1st stack");
        MyStack myStack2=(MyStack)myStack1.clone();
        System.out.println("Popping object from 1st stack...");
        myStack1.pop();
        System.out.println("1st Stack: "+myStack1);
        System.out.println("2nd Stack: "+myStack2);
        System.out.println("Is the 1st stack equal to the 2nd? " +
                (myStack1 == myStack2));
    }
}
