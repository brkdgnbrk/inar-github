package week_11.assignment.question_11_03;

public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance) {
        super(id, balance);

    }

    public double withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        } else
            System.out.println(
                    "Error! Savings account overdrawn transtaction rejected");
        return amount;
    }


}
