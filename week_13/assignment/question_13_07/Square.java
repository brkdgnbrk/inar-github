package week_13.assignment.question_13_07;

public class Square extends GeometricObject implements Colorable{
    private double side;
    public Square() {

    }
    public Square(double side){
        this.side=side;
    }
    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public double getArea(){
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
