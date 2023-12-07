package week_11.assignment.question_11_05;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String>students=new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }
    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equalsIgnoreCase(student)) {
                students.remove(i);
                numberOfStudents--;
            }
        }

    }
    public void clear(){
        students.clear();
    }
}




