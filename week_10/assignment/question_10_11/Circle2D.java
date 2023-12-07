package week_10.assignment.question_10_11;

import week_09.assignment.question_09_01.Main;

public class Circle2D {
    private double x;
    private double y;
    private double radius;
    public Circle2D(){
        this(0,0,1);
    }
    Circle2D(double x, double y, double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
   public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
    }


    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance + circle.radius <= this.radius;
    }


    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return distance < this.radius + circle.radius && !contains(circle);
    }

}
