package week_08.assignment;

public class Question_08_03 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] studentCorrectCount = new int[8];
        int[] studentIndex = new int[8];
        for (int i = 0; i < answers.length; i++) {
            int count = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    count++;
                }
            }
            studentCorrectCount[i] = count;
            studentIndex[i] = i;
        }
        for (int i = 0; i < studentCorrectCount.length; i++) {
            for (int j = i + 1; j < studentCorrectCount.length; j++) {
                if (studentCorrectCount[i] > studentCorrectCount[j]) {
                    int temp = studentCorrectCount[i];
                    studentCorrectCount[i] = studentCorrectCount[j];
                    studentCorrectCount[j] = temp;

                    int indexTemp = studentIndex[i];
                    studentIndex[i] = studentIndex[j];
                    studentIndex[j] = indexTemp;
                }

            }
            System.out.println("Student " + studentIndex[i] + "'s correct count is " + studentCorrectCount[i]);


        }

    }
}