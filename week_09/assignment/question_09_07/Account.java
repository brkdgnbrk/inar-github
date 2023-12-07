package week_09.assignment.question_09_07;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    Date dateCreated = new Date();

    Account() {

    }

    Account(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
    }

    int getId() {
        return id;
    }

    double getBalance() {
        return balance;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    Date getDateCreated() {
        return dateCreated;
    }

    double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 100 / 12;
    }

    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    double withdraw(double amount) {
        balance -=amount;
        return balance;
    }

    double deposit(double amount) {
        balance +=amount;
        return balance;
    }


}
