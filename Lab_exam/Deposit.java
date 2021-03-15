package Lab_exam;

public class Deposit extends Transaction{

    private BankAccount myAccount;
    private Object amount;

    public void excute(BankAccount myAccount, double amount) {
        this.myAccount = myAccount;
        this.amount = amount;
        
        System.out.println("My account is "+myAccount.getAmount());
        System.out.println("Deposit :"+amount);
        System.out.println("Your balance is "+(myAccount.getAmount()+amount));
        
    }

}
