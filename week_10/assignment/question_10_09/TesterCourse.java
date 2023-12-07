package week_10.assignment.question_10_09;

public class TesterCourse {
    public static void main(String[] args) {

        Course course1 = new Course("Java Tester");
        course1.addStudent("Özgür Kaya");
        course1.addStudent("Bilal Topal");
        course1.addStudent("Ada Kaya");
        course1.addStudent("Besim Karabıyık");
        course1.addStudent("Emir Uyanık");
        String []students= course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents() ; i++) {
            System.out.println(students[i]);
        }
        System.out.println("------------------------------\n");
        course1.dropStudent("Bilal Topal");
        course1.dropStudent("Emir Uyanık");
        for (int i = 0; i < course1.getNumberOfStudents() ; i++) {
            System.out.println(students[i]);
        }
        System.out.println("---------------------------");
        course1.clear();
        for (int i = 0; i < course1.getNumberOfStudents() ; i++) {
            System.out.println(students[i]);
        }
    }
}
