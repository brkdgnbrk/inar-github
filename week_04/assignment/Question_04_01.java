package week_04.assignment;

import java.util.Scanner;

public class Question_04_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lenght from the center to a vertex: ");
        double r = input.nextDouble(); //r is the length from the center of a pentagon to a vertex.
        double s =2*r*Math.sin(Math.PI/5);//s is the length of a side.
        double areaOfPentagon = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %1.2f",areaOfPentagon);
    }
}
