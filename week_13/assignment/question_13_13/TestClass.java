package week_13.assignment.question_13_13;

public class TestClass {
    public static void main(String[] args) throws CloneNotSupportedException{
        Course course1=new Course("SDET");
        course1.addStudent("Burak");
        course1.addStudent("Emre");
        course1.addStudent("Furkan");
        course1.addStudent("Jack");

        Course course2= (Course) course1.clone();
        course2.addStudent("Johnny");
        course2.addStudent("Tonny");
        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i <course1.getNumberOfStudents() ; i++) {
            System.out.print(students[i]+",");

        }
        System.out.println("\n\nNumber of students in course2: "
                + course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++)
            System.out.print(students2[i] + ", ");
        System.out.println();

    }
}
