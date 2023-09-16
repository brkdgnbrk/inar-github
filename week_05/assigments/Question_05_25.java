package week_05.assigments;

public class Question_05_25 {
    public static void main(String[] args) {
        double i = 1.0;
        double pi = 0;
        for (int n = 10000; n <= 1000000; n += 10000) {
            pi=0;
            for (i = 1.0; i < n; i++) {

                pi += 4.0 * ((Math.pow((-1), (i + 1)) / (2 * i - 1)));


            }
            System.out.println("PI value for i =  "+n +" : "+ pi);

        }
    }
}
