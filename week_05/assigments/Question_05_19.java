package week_05.assigments;

public class Question_05_19 {
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j <= 8 - i; j++) {    //sol baştan boşluk bırakmak için
                System.out.print("    ");
            }

            for (int j = 1; j <= i; j++) {    // artan sırada yazdırır
                System.out.print((int)Math.pow(2, j - 1) + "   ");
            }

            for (int j = i - 1; j >= 1; j--) {     //azalan sırada yazıdırır
                System.out.print((int)Math.pow(2, j - 1) + "   ");
            }

            System.out.println();
        }
    }
}
