package week_09.assignment.question_09_08;

public class Main {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        Fan fan = new Fan();
        fan.setSpeed(FAST);
        fan.setColor("yellow");
        fan.setRadius(10);
        fan.setOn(true);

        Fan fan1 = new Fan();
        fan1.setSpeed(MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setOn(false);
        System.out.println("Fan 1 " + fan.toString()+"\n-------------------------------");
        System.out.println("Fan 2 " + fan1.toString());

    }
}
