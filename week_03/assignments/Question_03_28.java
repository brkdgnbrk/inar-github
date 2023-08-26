package week_03.assignments;

import java.util.Scanner;

public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter r1's center x-,y-coordinates, width, and height: ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double width1=input.nextDouble();
        double height1=input.nextDouble();
        System.out.println("Enter r2's center x-,y-coordinates, width, and height: ");
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double width2=input.nextDouble();
        double height2=input.nextDouble();

        double solUst1X = x1 - width1 / 2;
        double solUst1Y = y1 + height1 / 2;
        double sagAlt1X = x1 + width1 / 2;
        double sagAlt1Y = y1 - height1 / 2;

        double solUst2X = x2 - width2 / 2;
        double solUst2Y = y2 + height2 / 2;
        double sagAlt2X = x2 + width2 / 2;
        double sagAlt2Y = y2 - height2 / 2;

        if (solUst2X >= solUst1X && sagAlt2X <= sagAlt1X && solUst2Y <= solUst1Y && sagAlt2Y >= sagAlt1Y) {
            System.out.println("r2 is inside r1.");
        } else if (sagAlt2X <= solUst1X || solUst2X >= sagAlt1X || solUst2Y >= sagAlt1Y || sagAlt2Y <= solUst1Y) {
            System.out.println("r2 does not overlap r1");
        } else {
            System.out.println("r2 overlaps r1");
        }




    }



}
