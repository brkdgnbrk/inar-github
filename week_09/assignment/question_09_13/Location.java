package week_09.assignment.question_09_13;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    Location(double[][] array) {
        maxValue = array[0][0];
        row = 0;
        column = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    row = i;
                    column = j;
                }
            }
        }
    }
}


