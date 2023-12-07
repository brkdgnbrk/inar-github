package week_13.assignment.question_13_09;

import java.util.Date;

public abstract class GeometricObject implements Comparable {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        this("green",false);
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String toString(){
        return "color: "+getColor()+" and filled: "+isFilled()+"\ncreated on "+getDateCreated();
    }

    public int compareTo(GeometricObject obj) {

        return 0;
    }

    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        if (obj1.compareTo(obj2) > 0) {
            return obj1;
        } else {
            return obj2;
        }
    }
}