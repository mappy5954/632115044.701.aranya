package Lab_exam;
public abstract class Transaction {
    public Transaction(){
        
    }

	public void excute(BankAccount acc, Double amount) {
        System.out.println("Perform Transaction");
    }

}