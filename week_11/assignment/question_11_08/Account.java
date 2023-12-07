package week_11.assignment.question_11_08;

import java.util.Date;
import java.util.ArrayList;
public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private ArrayList<Transaction> transactions;
   private Date dateCreated = new Date();

    Account() {

    }
    Account(String name,int id,double balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
        this.transactions = new ArrayList<>();
    }

    Account(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
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

    public void withdraw(double amount) {
        balance -=amount;
        transactions.add(new Transaction('W',amount,balance,"Withdraw from ATM"));
    }

    public void deposit(double amount) {
        balance +=amount;
        transactions.add(new Transaction('D',amount,balance,"Deposit to Bank"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}

