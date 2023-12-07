package week_12.assignment.question_12_09;



import java.util.Scanner;

public class BinaryException {
    public static void main(String[] args) throws BinaryFormatException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = input.next();
            int binaryInt = convertBinaryDecimal(binary);
            System.out.println("The decimal value for binary number " + binary + " is " + binaryInt);
    }
    public  static  int convertBinaryDecimal(String binary)throws BinaryFormatException{
        if (!binary.matches("[01]+")){
            throw new BinaryFormatException("It is not a binary string.!");
        }
        return Integer.parseInt(binary,2);
    }
}