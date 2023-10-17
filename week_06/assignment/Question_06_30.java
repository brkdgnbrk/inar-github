package week_06.assignment;

public class Question_06_30 {
    public static void main(String[] args) {
        int dice1 = dice1();
        int dice2 = dice2();

        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
        if (isWin(dice1, dice2)) {
            System.out.println("You win");
        } else if (isLose(dice1, dice2)) {
            System.out.println("You lose");
        } else {
            int sum = dice1 + dice2;
            do {
                dice1 = dice1();
                dice2 = dice2();
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
                if (dice1 + dice2 == 7) {
                    System.out.println("You lose");
                } else if (dice1 + dice2 == sum) {
                    System.out.println("You win");
                }
            } while (sum != dice1 + dice2 && dice2 + dice1 != 7);
        }
    }

    public static int dice1() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int dice2() {
        return (int) (Math.random() * 6) + 1;
    }


    public static boolean isLose(int dice1, int dice2) {
        return dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12;

    }

    public static boolean isWin(int dice1, int dice2) {
        return dice1 + dice2 == 11 || dice1 + dice2 == 7;
    }


}




