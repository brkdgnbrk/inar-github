package week_05.assigments;

public class Question_05_27 {
    public static void main(String[] args) {
        System.out.println("All the leap years from 101 to 2100: ");
        int count = 0;
        for (int i = 100; 2100 >= i; i = i+4) {
            if ((i % 100 != 0 && i % 4 == 0) || i % 400 == 0) {
                count++;
                if (count % 10 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");


                }
            }
        }

    }
}