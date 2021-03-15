package Lab_exam;
public class Main {
    public static void main(String args[]) {
        BankAccount myAccount = new BankAccount(1000.00);

		viewBalance viewBalance = new viewBalance(); 
        
        System.out.println("------Check balance-------");
		viewBalance.excute(myAccount,0.00);
		Withdraw withdraw = new Withdraw();
		Deposit deposit = new Deposit();
		
        System.out.println("-------Withdraw------------");
        withdraw.excute(myAccount, 100.00);
		
        System.out.println("------Check balance-------");
        viewBalance.excute(myAccount,0.00);		
		
        System.out.println("++++++++Deposit+++++++++");
        deposit.excute(myAccount, 500.00);
		
        System.out.println("------Check balance--------");
        viewBalance.excute(myAccount,0.00);

        System.out.println("-------Withdraw------------");
        withdraw.excute(myAccount, 2000.00);
        System.out.println("--------End of ATM-----------");
    }

}
