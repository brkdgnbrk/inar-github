package week_07.assignment;

public class Question_07_07 {
    public static void main(String[] args) {

        int[] count = new int[10];

        int num;
        for (int i = 0; i < 100; i++) {
            num = (int) (Math.random() * 10);
            count[num]++;
            //for (int i = 1; i <= 100; i++) {
            //			counts[(int)(Math.random() * 10)]++;
            //		}


        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "s: " + count[i]);
        }
    }
}
