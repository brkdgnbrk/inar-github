package week_07.assignment;

import java.util.Random;

public class Question_07_16 {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        int key = 1+(int) (Math.random() * 1000000);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000000);
        }
        int searchResult;
        long startTime = System.currentTimeMillis();
        searchResult = linearSearch(numbers, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the linearSearch in milliseconds: " + executionTime);

        selectionSort(numbers);
        startTime = System.currentTimeMillis();
        searchResult = binarySearch(numbers, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the binarySearch in milliseconds: " + executionTime + " ");
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (list[mid] > key) {
                high = mid - 1;
            } else if (key == list[mid])
                return mid;
            else low = mid + 1;
        }
        return -low - 1;
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = 0; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }
}
