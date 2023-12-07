package week_11.assignment.question_11_02;

import week_10.assignment.question_10_14.MyDate;

public class Employee extends Person {
    private int office;
    private double salary;
    private MyDate datehired;

    public Employee() {

    }

    public Employee(int office, double salary) {
        this.office = office;
        this.salary = salary;
        this.datehired = new MyDate();
    }

    public Employee(String name, String address, String phone, String email, int office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.datehired = new MyDate();
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDatehired() {
        return datehired.getMonth() + "/" + datehired.getDay()
                + "/" + datehired.getYear();
    }

    public void setDatehired(MyDate datehired) {
        this.datehired = datehired;
    }
    public String toString(){
        return "     _Employee_\n"+ super.toString() + "\nOffice: " + office +
                "\nSalary: $" + getSalary() + "\nDate hired: " + getDatehired();
    }
}
