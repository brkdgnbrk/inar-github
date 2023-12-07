package week_10.assignment.question_10_05;

public class StackOfIntegers {
    private int []number;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;
   public StackOfIntegers(){
this(DEFAULT_CAPACITY);
    }
    public StackOfIntegers(int capacity){
       number=new int[capacity];
    }
    public boolean empty(){
    return size==0;
    }
    public int peek(){
    return number[size-1];
    }
    public void push(int value){
    if (size>=number.length){
        int[]temp=new int[number.length*2];
        System.arraycopy(number,0,temp,0,number.length);
        number=temp;
    }
    number[size++]=value;
    }
    public int pop(){
        return number[--size];
    }
    public int getSize(){
    return size;
    }


    public void setNumber(int number) {

    }

}
