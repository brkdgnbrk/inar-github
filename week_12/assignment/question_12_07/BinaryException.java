package week_12.assignment.question_12_07;



import java.util.Scanner;

public class BinaryException {
    public static void main(String[] args) throws NumberFormatException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = input.next();
        try {
            int binaryInt = convertBinaryDecimal(binary);
            System.out.println("The decimal value for binary number " + binary + " is " + binaryInt);
        } catch (Exception e) {
            System.out.println("It is not a binary string ");

        }
    }
    public  static  int convertBinaryDecimal(String binary)throws NumberFormatException{
        if (!binary.matches("[01]+")){
            throw new NumberFormatException("Invalid binary number");
        }
        return Integer.parseInt(binary,2);
    }
}