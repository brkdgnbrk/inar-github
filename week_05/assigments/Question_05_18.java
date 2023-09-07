package week_05.assigments;

public class Question_05_18 {
    public static void main(String[] args) {
        //Pattern A

        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= 7 - i; j--) {
                System.out.print(7 - j + " ");
            }
            System.out.println();


        }
        System.out.println("-------------------------------");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print(7 - j + " ");
            }
            System.out.println();

        }
        System.out.println("--------------------------------");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6 - i; 1 <= j; j--) {
                System.out.print("  ");

            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
        System.out.println("--------------------------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; i > j; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 6 - i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();

        }

    }
}
