package week_13.assignment.question_13_11;

public class TestClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon = new Octagon(5);
        System.out.println(octagon);
        System.out.println("Cloning the Octagon...");
        Octagon octagon1 = (Octagon) octagon.clone();
        int result = (octagon.compareTo(octagon1));
        if (result == 1)
            System.out.println("Octagon is greather than its clone.");
        else if (result == -1)
            System.out.println("Octagon is less than its clone.");
        else
            System.out.println("Octagon is equal to its clone.");
    }
}
