package week_13.assignment.question_13_01;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    Triangle(String color,boolean filled,double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }




    @Override
    public String toString() {
        return super.toString()+"\nTriangle : side1 : "+getSide1()+"\nTriangle : side2 : "+getSide2()+"\nTriangle : side2 : "+getSide3();
    }

    @Override
    public double getArea() {
        double side = (side1 + side2 + side3) / 2;
        return Math.pow(side * (side - side1) * (side - side2) * (side - side3), 0.5);
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}


