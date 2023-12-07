package week_11.assignment.question_11_02;

public class Faculty extends Employee {
    private String officeHour;
    private String rank;

    public Faculty(String officeHour, String rank) {
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public Faculty(int office, double salary, String officeHour, String rank) {
        super(office, salary);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public Faculty(String name, String address, String phone, String email, int office, double salary, String officeHour, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public String toString(){
        return "     _Faculty_\n"+super.toString()+"\nofficeHours: "+officeHour+"\nrank: "+rank;
    }
}
