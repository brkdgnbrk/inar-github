package week_06.assignment;

public class Question_06_16 {
    public static void main(String[] args) {
        System.out.println("Year      Days in year");
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%-5d %12d\n", i, numberOfDaysInAYear(i));
        }


    }

    public static int numberOfDaysInAYear(int year) {
        if (isLeapYear(year))
            return 366;
        else
            return 365;


    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 4 == 0);

    }
}

