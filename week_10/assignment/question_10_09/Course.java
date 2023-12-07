package week_10.assignment.question_10_09;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(student)) {
                for (int j = i; j < students.length-1; j++) {
                    students[j] = students[j + 1];
                }
                numberOfStudents--;
                break;
            }
        }

    }
    public void clear(){
        for (int i = 0; i <students.length ; i++) {
            students[i]="";
        }
        numberOfStudents=0;
    }
}

