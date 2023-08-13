package week_02.assignments;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_02_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet ");
        double feet = input.nextDouble();
        final double METER_FOR_ONE_FOOT = 0.305;
        double meters = feet * METER_FOR_ONE_FOOT;
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
