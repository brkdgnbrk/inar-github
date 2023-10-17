package week_06.assignment;

public class Question_06_14 {
    public static void main(String[] args) {
        System.out.println("i          m(i)");
        System.out.println("--------------------");
        for (int i = 1; i <902 ; i+=100) {
            System.out.printf("%-5d",i);
            System.out.printf("%10.4f\n",pi(i));
        }

    }

    public static double pi(double number){
        double pi = 0;
        for (double i = 1; i <= number; i ++) {
            pi += Math.pow(-1, i +1) / (2 * i - 1);
        }
        pi *= 4;
        return pi;
        }
    }

