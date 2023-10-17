package week_07.assignment;

public class Question_07_29_ {
    public static void main(String[] args) {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        for (int i = 0; i < deck.length; i++) {
            int index = 1 + (int) (Math.random() * 52);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck.length; j++) {
                for (int k = 0; k < deck.length; k++) {
                    for (int l = 0; l < deck.length; l++) {
                        if (deck[i] + deck[j] + deck[k] + deck[l] == 24) {
                            System.out.println(deck[i] + " " + deck[j] + " " + deck[k] + " " + deck[l]);

                        }
                    }
                }
            }
        }
    }
}