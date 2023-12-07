package week_09.assignment.question_09_07;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Account account=new Account(1122,20000);
        account.withdraw(2500);
        account.deposit(3000);
        account.setAnnualInterestRate(4.5);
        account.getMonthlyInterest();


        System.out.println("             Account Statement :\n" +
                "-------------------------------------------\n" +
                "Account ID       :"+(account.getId())+"\n" +
                "Data created     :" +account.getDateCreated()+"\n" +
                "Balance          :"+account.getBalance()+"\n" +
                "Monthly Interest :"+account.getMonthlyInterest());


    }
}
