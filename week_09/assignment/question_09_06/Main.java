package week_09.assignment.question_09_06;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int size = 100000;
        int[] numbers = getNumbers(size);
        selectionSort(numbers);
        stopWatch.stop();
        System.out.println("The execution time of sorting 100,000 numbers using selection sort: " + stopWatch.getElapsedTime() + " milliseconds");

    }

    public static int[] getNumbers(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }
        return numbers;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
}