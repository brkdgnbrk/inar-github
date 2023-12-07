package week_13.assignment.question_13_06;

public class ComparableCircle extends Circle implements Comparable {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Circle o) {
        return 0;
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getArea() < o.getArea()) {
            return -1;
        } else if (this.getArea() > o.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
    @Override
    public String toString(){
        return super.toString()+"\nArea: "+getArea();
    }
}
