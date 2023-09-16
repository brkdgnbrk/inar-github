package week_05.assigments;

public class Question_05_26 {
    public static void main(String[] args) {
        double e=1.0;
        double firstValue=1.0;
        for (int i = 1; i <100000 ; i++) {
            firstValue=firstValue/i;
            e+=firstValue;
            if (i%10000==0){
                System.out.println("e at i= "+i+" is "+e);
            }
        }
    }
}
