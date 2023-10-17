package week_06.assignment;

public class Question_06_38 {
    public static void main(String[] args) {
        final int UPPERCASE_LETTER = 100;
        final int DIGIT = 100;
        final int NUMBER_PER_LINE = 10;
        for (char i = 1; i < 101; i++) {
            if (i % NUMBER_PER_LINE == 0) {
                System.out.println(getRandomUpperCaseLetter());
            } else {
                System.out.print(getRandomUpperCaseLetter() + " ");
            }
        }
        for (int i = 1; i < 101; i++) {
            if (i % NUMBER_PER_LINE == 0) {
                System.out.println(getRandomDigitCharacter());
            } else {
                System.out.print(getRandomDigitCharacter() + " ");
            }
        }

    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (Math.random() * (ch2 - ch1 + 1) + ch1);
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
}
