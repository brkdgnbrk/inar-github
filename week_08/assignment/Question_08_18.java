package week_08.assignment;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[0].length ; j++) {
                System.out.print(m[i][j]+" ");

            }
            System.out.println();
        }


    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                int random=(int)(Math.random()*5);
                int tempRow=m[j][0];
                int tempColumn=m[j][1];
                m[j][0]=m[random][0];
                m[j][1]=m[random][1];
                m[random][0]=tempRow;
                m[random][1]=tempColumn;


            }

        }
    }
}
