package week_10.assignment.question_10_03;

public class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
       return isPrime(value);
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(int value) {
        if (value % 2 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i < Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger value) {
        return value.isEven();
    }

    public static boolean isOdd(MyInteger value) {
        return value.isOdd();
    }

    public static boolean isPrime(MyInteger value) {
        return value.isPrime();
    }

    public boolean equals(int values) {
        if (values == value) {
            return true;
        }
        return false;
    }

    public boolean equals(MyInteger value) {
        int number = value.getValue();
        if (this.value == number) {
            return true;
        }
        return false;
    }

    public static int parseInt(char[] value) {
        String numberStr = "";
        for (int i = 0; i < value.length; i++) {
            numberStr += value[i];
        }
        return Integer.parseInt(numberStr);
    }

    public static int parseInt(String values) {
        return Integer.parseInt(values);
    }


}
