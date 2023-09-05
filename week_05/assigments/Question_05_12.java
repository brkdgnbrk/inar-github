package week_05.assigments;

public class Question_05_12 {
    public static void main(String[] args) {
        int i = 1;
        while (Math.pow(i, 2) < 12000) {
            i--;

        }
        System.out.println("The smallest n is " + i);
    }
}
