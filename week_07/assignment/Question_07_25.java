package week_07.assignment;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double[] eqn = new double[3];
        double[]roots=new double[2];
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }
        double realRoots=solveQuadratic(eqn,roots);


        if ( realRoots==2) {
            System.out.println("The number of real roots: 2");
            double r1 = (-eqn[1] + Math.pow(Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2], 0.5))/2*eqn[0];
            double r2 = (-eqn[1] - Math.pow(Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2], 0.5))/2*eqn[0];
            System.out.println("The roots of equation: "+r1+" "+r2);
        } else if (realRoots== 1) {
            double r1 = (-eqn[1] + Math.pow(Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2], 0.5))/2*eqn[0];
            System.out.print("The equation has one root "+r1);
        } else {
            System.out.print("The equation has no real root");
        }
    }
    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return 2;
        } else if (discriminant == 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            return 1;
        } else {
            return 0;
        }
    }
}
