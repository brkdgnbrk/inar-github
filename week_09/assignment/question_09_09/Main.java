package week_09.assignment.question_09_09;

public class Main {
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon();
        System.out.println("First RegularPolygon perimeter is : " + regularPolygon.getPerimeter() + "   area is : " + regularPolygon.getArea());
        RegularPolygon regularPolygon1=new RegularPolygon(6,4);
        System.out.println("Second RegularPolygon perimeter is : " + regularPolygon1.getPerimeter() + "   area is : " + regularPolygon1.getArea());
        RegularPolygon regularPolygon2=new RegularPolygon(10,4,5.6,7.8);
        System.out.println("Second RegularPolygon perimeter is : " + regularPolygon2.getPerimeter() + "   area is : " + regularPolygon2.getArea());
    }
}
