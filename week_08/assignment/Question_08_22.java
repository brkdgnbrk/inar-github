package week_08.assignment;

public class Question_08_22 {
    public static void main(String[] args) {
        int[][] array = getValue();
        display(array);
        if (isEvenNumberOf1sForRow(array)) {
            System.out.println("Every row have an even number of 1s");
        } else {
            System.out.println("Every row does not have an even number of 1s");
        }
        if (isEvenNumberOf1sForColumn(array)) {
            System.out.println("Every column have an even number of 1s");
        } else {
            System.out.println("Every column does not have an even number of 1s");
        }

    }
    public static void display(int[][]array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                System.out.print(array[i][j]+" ");

            }
            System.out.println();
        }
    }

    public static int[][] getValue() {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }

        }
        return array;
    }

    public static boolean isEvenNumberOf1sForRow(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 1) {
                    count++;
                }

            }
            if (count % 2!=0) {
                return false;
            }

        }
        return true;
    }

    public static boolean isEvenNumberOf1sForColumn(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] == 1) {
                    count++;
                }

            }
            if (count % 2!=0) {
                return false;
            }

        }
        return true;
    }
}
