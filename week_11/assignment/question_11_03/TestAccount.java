package week_11.assignment.question_11_03;

public class TestAccount {
    public static void main(String[] args) {
        Account account=new Account(11,1450);
        SavingsAccount savingsAccount=new SavingsAccount(11,1450);
        CheckingAccount checkingAccount=new CheckingAccount(11,1450,500);

        System.out.println(account);
        System.out.println(savingsAccount);
        System.out.println(checkingAccount);
    }
}
