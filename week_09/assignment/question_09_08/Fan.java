package week_09.assignment.question_09_08;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDİUM = 2;
    private static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";

    }

    public int getSpeed() {
        int strSpeed=1;
        switch (speed) {
            case SLOW:
                strSpeed = 1;
                break;
            case MEDİUM:
                strSpeed = 2;
                break;
            case FAST:
                strSpeed = 3;
                break;
        }
        return strSpeed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Speed: " + getSpeed() + ", Color: " + getColor()+ ", Radius: " + getRadius();
        } else {
            return "Color: " + getColor() + ", Radius: " + getRadius() + "\nFan is off";
        }

    }
}
