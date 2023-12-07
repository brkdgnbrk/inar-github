package week_10.assignment.question_10_04;

public class Main {
    public static void main(String[] args) {
        MyPoint myPoint=new MyPoint();
        MyPoint myPoint1=new MyPoint(10.0,30.5);
        System.out.println("The distance between ("+myPoint.getX()+", "+myPoint.getY()+") and ("+myPoint1.getX()+", "+myPoint1.getY()+") is: "+myPoint.distance(myPoint1));
    }
}
