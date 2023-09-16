package week_05.assigments;

public class Question_05_33 {
    public static void main(String[] args) {
        int divisor = 0;  // her defasında toplalan divisor ı tekrar sıfırlarız
        int i = 1;
        for (i = 1; 10000 > i; i++) {
            divisor = 0;
            for (int j = 1; i > j; j++) {
                if (i % j == 0) {
                    divisor += j;
                }
            }
            if (divisor == i) {
                System.out.print(divisor + " ");


            }


        }


    }
}
