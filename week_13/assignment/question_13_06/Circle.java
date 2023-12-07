package week_13.assignment.question_13_06;

import week_13.assignment.question_13_05.GeometricObject;

public abstract class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(GeometricObject obj) {
        if (obj instanceof Circle) {
            Circle otherCircle = (Circle) obj;
            return Double.compare(this.radius, otherCircle.radius);
        }
        return super.compareTo(obj);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    @Override
    public String toString(){
        return super.toString()+"\nRadius: "+getRadius()+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter();
    }

    public abstract int compareTo(Circle o);

    public abstract int compareTo(ComparableCircle other);
}
