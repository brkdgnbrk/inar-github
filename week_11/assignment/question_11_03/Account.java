package week_11.assignment.question_11_03;

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

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
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
    public String toString(){
        return "ID :"+id+"\nBalance is "+balance;
    }


}
