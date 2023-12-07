package week_13.assignment.question_13_07;

import java.util.ArrayList;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] list = { new Square(54), new Square(2.4), new Square(3), new Square(12), new Square(4.23) };

        for (int i = 0; i < list.length; i++) {
            System.out.println("Area of Geometric Object in the index " + i + " is: " + list[i].getArea());
            System.out.println("--------------------------------------------------");

            if (list[i] instanceof Colorable) {
                ((Colorable) list[i]).howToColor();
            } else {
                System.out.println("This object is not colorable.");
            }
        }
    }
}