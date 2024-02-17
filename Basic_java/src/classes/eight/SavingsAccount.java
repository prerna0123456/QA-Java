package classes.eight;

public class SavingsAccount extends BankAccount {
	
	
	public SavingsAccount(String account_no, double baln) {
	    
	    super(account_no, baln);
	    
	}


	public void withdraw(double amount) {
	    
	    if(getBalance() - amount >100) {
	        
	        super.withdraw(amount);
	    } else {
	        
	        System.out.println("Insufficient balance in savings account to perform a withdrawal.");
	    }
	}

}
