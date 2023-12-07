package week_13.assignment.question_13_05;
public class TestGeometricObject {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.0);

        Rectangle rectangle1 = new Rectangle(15, 12.0);
        Rectangle rectangle2 = new Rectangle(3.0, 8.0);
        Circle maxCircle = (Circle) GeometricObject.max(circle1, circle2);
        System.out.println(maxCircle.toString());
        System.out.println();

        Rectangle maxRectangle = (Rectangle) GeometricObject.max(rectangle1, rectangle2);
        System.out.println(maxRectangle.toString());
    }
}