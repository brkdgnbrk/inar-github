package week_05.assigments;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer,the inpt ends if it is 0: ");
        int number=input.nextInt();
        int countPositive=0;
        int countNegative=0;
        double sum=0;
        if (number==0){
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }
        while(number!=0){
            if(number>0){
                countPositive++;

            } else if (number<0) {
                countNegative++;

            }sum+=number;
            number=input.nextInt();
        }
        System.out.println("The number of positives is "+countPositive);
        System.out.println("The number of negatives is "+countNegative);
        System.out.println("The total is "+sum);
        System.out.println("The average is "+sum/(countPositive+countNegative));



    }
}
