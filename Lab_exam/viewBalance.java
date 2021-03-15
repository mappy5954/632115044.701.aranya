package Lab_exam;

public class viewBalance extends Transaction{

    private BankAccount myAccount;
    private double amount;

    public void excute(BankAccount myAccount, double amount) {
        this.myAccount = myAccount;
        this.amount = amount;

        System.out.println("My account is "+myAccount.getAmount()+" now your blance is "+myAccount.getAmount());
    }

}
