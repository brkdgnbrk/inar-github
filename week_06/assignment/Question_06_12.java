package week_06.assignment;

public class Question_06_12 {
    public static void main(String[] args) {
        printChars('1','Z',10);
    }
    public static void printChars(char ch1,char ch2,int numberPerline) {
        System.out.println("Charater per 1 to Z");
        int count = 0;
        for (char i = ch1; i <= ch2; i++) {
            count++;
            if (count%numberPerline==0) {
                System.out.println(i);
            } else {
                System.out.print(i+" ");

            }
        }
    }
}
