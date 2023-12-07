package week_11.assignment.question_11_02;

public class Staff extends Employee{
    private String title;
    Staff(String title){
        this.title=title;
    }
    Staff(int office, double salary,String title){
        super(office,salary);
        this.title=title;
    }
    Staff(String name, String address, String phone, String email, int office, double salary,String title){
        super(name,address,phone,email,office,salary);
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString(){
        return "     _Staff_\n"+super.toString()+"\nTitle: "+title;
    }
}
