package week_03.assignments;

import java.util.Scanner;

public class Question_03_13 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er),\n" +
                "2-married separately, 3-head of household)\n" +
                "Enter the filing status:");
        int status=input.nextInt();
        System.out.println("Enter the taxable income: ");
        double income=input.nextInt();
        System.out.print("Tax is ");


        switch (status){
            case 0:if(income<8350){
                System.out.println(income*0.10);
            } else if (income<33950) {
                System.out.println(8350*0.10+((income-8350)*0.15));
            } else if (income<82250) {
                System.out.println(8350*0.10+((33950-8350)*0.15)+((income-33950)*0.25));
            } else if (income<171550) {
                System.out.println(8350*0.10+((33950-8350)*0.15)+((82250-33950)*0.25)+(income-82250)*0.28);
            } else if (income<372950) {
                System.out.println((8350*0.10+((33950-8350)*0.15)+((82250-33950)*0.25)+(171550-82250)*0.28+(income-171550)*0.33));
            } else {
                System.out.println((8350*0.10+((33950-8350)*0.15)+((82250-33950)*0.25)+(171550-82250)*0.28+(372950-171550)*0.33)+(income-372950)*0.35);
            }
            case 1:if(income<16700){
                System.out.println(income*0.10);
            } else if (income<67900) {
                System.out.println(16700*0.10+((income-16700)*0.15));
            } else if (income<137050) {
                System.out.println(16700*0.10+((67900-16700)*0.15)+((income-67900)*0.25));
            } else if (income<208850) {
                System.out.println(16700*0.10+((67900-16700)*0.15)+((137050-67900)*0.25)+(income-137050)*0.28);
            } else if (income<372950) {
                System.out.println((16700*0.10+((67900-16700)*0.15)+((137050-67900)*0.25)+(208850-137050)*0.28+(income-208850)*0.33));
            } else {
                System.out.println((16700*0.10+((67900-16700)*0.15)+((137050-67900)*0.25)+(208850-137050)*0.28+(372950-208850)*0.33)+(income-372950)*0.35);

            }
        }


    }
}
