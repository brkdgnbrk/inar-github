package week_10.assignment.question_10_03;

public class Main {
    public static void main(String[] args) {

        MyInteger myInteger = new MyInteger(41614161);
        char[] charArray = {'1', '2', '3'};

        System.out.println("getValue(): "+myInteger.getValue());
        System.out.println("isEven(): "+myInteger.isEven());
        System.out.println("isOdd(): "+myInteger.isOdd());
        System.out.println("isPrime: "+myInteger.isPrime());
        System.out.println("equals(10): "+myInteger.equals(10));
        System.out.println("equals(MyInteger(41614161)): "+myInteger.equals(41614161));
        System.out.println("isEven(41614161): "+MyInteger.isEven(41614161));
        System.out.println("isOdd(41614161): "+MyInteger.isOdd(41614161));
        System.out.println("isPrime(41614161): "+MyInteger.isPrime(41614161));
        System.out.println("parseInt(char[]{1,2,3}) static: " + MyInteger.parseInt(charArray));
        System.out.println("parseInt(String 123) static: "+MyInteger.parseInt("123"));
    }
}
