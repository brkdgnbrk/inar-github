package week_13.assignment.question_13_12;

import week_13.assignment.question_13_12.GeometricObject;

public class Rectangle extends GeometricObject implements Comparable{
    private double length;
    private double width;
    public Rectangle() {
        super();
        length = 1.0;
        width = 1.0;
    }
    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    public double getHeight() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
    @Override
    public boolean equals(Object obj) {
        return this.compareTo((Rectangle)obj) == 0;
    }
    @Override
    public int compareTo(GeometricObject obj) {
        if (obj instanceof Rectangle) {
            Rectangle otherRectangle = (Rectangle) obj;
            return Double.compare(this.getArea(), otherRectangle.getArea());
        }return super.compareTo(obj);
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
    @Override
    public String toString(){
        return super.toString()+"\nWidth: "+getWidth()+"\nHeight: "+getHeight()+"\nArea: "+getArea()+"\nPerimeter"+getPerimeter();
    }
}