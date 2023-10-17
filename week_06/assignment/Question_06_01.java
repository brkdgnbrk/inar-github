package week_06.assignment;

public class Question_06_01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int pentagonalNumber = getPentagonalNumber(i);
            if (i%10==0) {
                System.out.printf("%10d\n ",pentagonalNumber);
            }else System.out.printf("%9d ",pentagonalNumber);

        }
    }

    public static int getPentagonalNumber(int n) {
        int result = n * (3 * n - 1) / 2;
        return result;
    }
}



