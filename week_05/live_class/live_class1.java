package week_05.live_class;

public class live_class1 {
    public static void main(String[] args) {
        for (int i = 1; 100 > i; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 3 != 0 || i % 5 != 0) {
                System.out.println(i);
            }

        }
    }
}
