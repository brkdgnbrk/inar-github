package week_11.assignment.question_11_05;

public class TestCourse {
    public static void main(String[] args) {
        Course course=new Course("Java");
        System.out.println("After adding student to the course..");
        course.addStudent("Nisanur Altuntas");
        course.addStudent("Gurkan SERTESER");
        course.addStudent("Sinan Çetin");
        course.addStudent("Mehmet Toprak");
        course.addStudent("Sefa Atakul");
        course.addStudent("Musa Denis");
        course.addStudent("Berkan Eris");
        System.out.println(course.getStudents());
        System.out.println("Number of students: "+course.getNumberOfStudents());
        System.out.println("After dropping student from the course..");
        course.dropStudent("Sinan Çetin");
        course.dropStudent("Mehmet Toprak");
        course.dropStudent("Berkan Eris");
        System.out.println(course.getStudents());
        System.out.println("Number of student: "+course.getNumberOfStudents());
    }
}
