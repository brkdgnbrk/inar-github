package week_10.assignment.question_10_02;

public class Main {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Martin", 26, 90, 5, 10);
        System.out.println("Name: " + bmi1.getName() + "\nBMI: "
                + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Adam Smith", 90, 179);
        System.out.println("Name: " + bmi2.getName() + " \nBMI:  "
                + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}