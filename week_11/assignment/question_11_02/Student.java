package week_11.assignment.question_11_02;

public class Student extends Person {
    private int status;
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 3;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 4;

    Student() {
        this.status = status;
    }

    Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1 : return "freshman";
            case 2 : return "sophomore";
            case 3 : return "junior";
            case 4 : return "senior";
            default : return "Unknown";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String toString() {
        return "    _Student_ \n"+ super.toString() + "\nClassStatus: "+getStatus();
    }
}
