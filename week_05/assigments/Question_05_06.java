package week_05.assigments;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Question_05_06 {
    public static void main(String[] args) {
        final double MILE_PER_KILOMETER=1.609;
        System.out.println("Miles       Kilometers     |  Kilometers       Miles");
        for (int numberOfMiles=1,numberOfKilometers=20;numberOfMiles<=10&&numberOfKilometers<=65;numberOfMiles+=1,numberOfKilometers+=5){
            System.out.printf("%-10d %8.3f        |  %-4d %18.3f\n",numberOfMiles,(numberOfMiles*MILE_PER_KILOMETER),numberOfKilometers,(numberOfKilometers/MILE_PER_KILOMETER));
        }
    }
}
