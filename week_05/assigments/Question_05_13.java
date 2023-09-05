package week_05.assigments;

public class Question_05_13 {
    public static void main(String[] args) {
        int n = 0;
        while (Math.pow(n+1,3) < 12000) {
            n++;
        }System.out.println("The largest n is "+n);
    }
}
