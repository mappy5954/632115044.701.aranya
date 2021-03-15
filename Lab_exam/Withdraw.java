package Lab_exam;

public class Withdraw extends Transaction{

	private BankAccount myAccount;
    private double amount;

    public void excute(BankAccount myAccount, double amount) {
        this.myAccount = myAccount;
        this.amount = amount;
        
        System.out.println("My account is "+myAccount.getAmount());
        System.out.println("Withdraw :"+amount);
        myAccount.setAmount((myAccount.getAmount()-amount));

        if(amount>myAccount.getAmount()){
            System.out.println("Sorry your balance is not enough");
        }
        else{
            System.out.println("Your balance is "+myAccount.getAmount());
        }
	}

}
