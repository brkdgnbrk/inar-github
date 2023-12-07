package week_13.assignment.question_13_11;

public class Octagon extends GeometricObject implements Comparable, Cloneable {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public String toString() {
        return "Area: " + getArea() + "\nPerimeter: " + getPerimeter();
    }


    public int compareTo(Octagon o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Object clone() throws CloneNotSupportedException {
        Octagon octagon = (Octagon) super.clone();
        return super.clone();
    }
}
