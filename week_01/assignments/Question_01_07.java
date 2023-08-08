package week_01.assignments;

public class Question_01_07 {
    public static void main(String[] Args){
        System.out.println("π = 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ...)" );
        System.out.print("π1 = 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 ) =  ");
        System.out.println(4* (1-(1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
        System.out.print("π2 = 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 =  ");
        System.out.println(4* (1-(1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
    }
}
