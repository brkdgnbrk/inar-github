package week_08.assignment;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        int[][] workingHours = getValue();
        int[] totalHours=totalHours(workingHours);
        sortHours(totalHours);
    }

    public static int[][] getValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        int employeeNumber = input.nextInt();
        int[][] workingHours = new int[employeeNumber][7];
        System.out.print("Enter the working hours of employees: ");
        for (int i = 0; i < workingHours.length; i++) {
            for (int day = 0; day < workingHours[0].length; day++) {
                workingHours[i][day] = input.nextInt();

            }

        }
        return workingHours;
    }

    public static void sortHours(int[] totalHours) {
        int[] employees={0,1,2};
        for (int i = 0; i < totalHours.length; i++) {
            for (int j = i + 1; j < totalHours.length; j++) {
                if (totalHours[i] < totalHours[j]) { //çalışanların toplam saatlerini sıralar
                    int temp = totalHours[i];
                    totalHours[i] = totalHours[j];
                    totalHours[j] = temp;

                    int employeesTemp=employees[i];
                    employees[i]=employees[j];
                    employees[j]=employeesTemp;


                }
            }
            System.out.println("Employee " + employees[i] + "'s total work hour is " + totalHours[i]);
        }
    }

    public static int[] totalHours(int[][] hours) {
        int[] totalHours = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                totalHours[i] += hours[i][j];

            }

        } return totalHours;
    }
}