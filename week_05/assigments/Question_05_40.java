package week_05.assigments;

public class Question_05_40 {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        for (int i = 1; i <= 1000000; i++) {
            int headsOrTails = (int) (Math.random() *2);
            if (headsOrTails == 1) {
                heads++;
            } else {
                tails++;
            }

        }
        System.out.println("Heads: " + heads + "\n Tails: " + tails);
    }
}
