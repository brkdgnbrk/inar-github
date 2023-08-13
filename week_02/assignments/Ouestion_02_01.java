package week_02.assignments;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ouestion_02_01 {
    public static void main(String[] Args){

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: " );
        double celsius=input.nextDouble();

        double fahrenheit=(9.0/5)*celsius+32;
        System.out.println(celsius + " Celsius " + " is " +  fahrenheit  + " Fahrenheit ");


    }
}
