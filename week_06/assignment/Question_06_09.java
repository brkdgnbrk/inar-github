package week_06.assignment;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet     Meters     |     Meters     Feet");
        System.out.println("----------------------------------------------");
        for (double feet = 1, meters = 20; feet <= 10; feet++, meters += 5) {
            System.out.printf("%-4.1f %9.3f      | %8.1f %12.3f\n", feet, footToMeter(feet), meters, meterToFoot(meters));


        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
