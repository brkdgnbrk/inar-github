package week_13.assignment.question_13_10;

public class TestClass {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(5,3);
        Rectangle rectangle2=new Rectangle(3,5);
        Rectangle rectangle3=new Rectangle(6,4);
        System.out.println("Rectangle1 Area :"+rectangle1.getArea());
        System.out.println("Rectangle2 Area :"+rectangle2.getArea());
        System.out.println("Rectangle3 Area :"+rectangle3.getArea());
        System.out.println("Circle1 is " + (rectangle1.equals(rectangle2) ? "" : "not ") +
                "equal to circle2");

        System.out.println("Circle1 is " + (rectangle1.equals(rectangle3) ? "" : "not ") +
                "equal to circle3");
    }
}
