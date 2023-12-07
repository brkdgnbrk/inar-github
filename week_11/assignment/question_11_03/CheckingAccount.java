package week_11.assignment.question_11_03;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(int id, double initialBalance, double overdraftLimit) {
        super(id, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }


    public double getOverdraftLimit() {
        return overdraftLimit;
    }


    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double withdraw(double amount) {
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        } else
            System.out.println("Error! Amount exceeds overdraft limit.");
        return amount;
    }


    public String toString() {
        return super.toString() + "\nOverdraft limit: $" + overdraftLimit;
    }
}