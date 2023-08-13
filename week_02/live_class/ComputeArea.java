package week_02.live_class;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        double radius;
        double area;
        final double PI;
        PI = 3.14;
        radius = input.nextDouble();
        area = PI * radius * radius;
        System.out.println("area is for circle " + area);

    }
}
