package week_04.assignment;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firstCity=input.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity=input.nextLine();
        System.out.print("Enter the third city: ");
        String thirdCity=input.nextLine();
        String temp;
        if (firstCity.compareToIgnoreCase(secondCity)>0){
            temp=firstCity;
            firstCity=secondCity;
            secondCity=temp;

        }if (firstCity.compareToIgnoreCase(thirdCity)>0){
            temp=firstCity;
            firstCity=thirdCity;
            thirdCity=temp;

        }if (secondCity.compareToIgnoreCase(thirdCity)>0){
            temp=secondCity;
            secondCity=thirdCity;
            thirdCity=temp;
        }
        System.out.println("The three cities in alphabetical order are "+firstCity.toUpperCase()+" "+secondCity.toUpperCase()+" "+thirdCity.toUpperCase());
    }
}
