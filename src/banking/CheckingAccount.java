package banking;

public class CheckingAccount extends Account {
	private Double overdraftProtection;//??
	
	public CheckingAccount(double balance){
		super(balance);
	}
	public CheckingAccount(double balance, double protect){
		super(balance);
		this.overdraftProtection = protect;
	} 
	
	public void withdraw(double amount) {
		
		if(balance >= amount){
			balance -= amount;
		}
		else{
			if(overdraftProtection == null)
				throw new OverdraftException("no overdraft protection", amount - balance);
			if(overdraftProtection >= (amount - balance)){
			 	overdraftProtection -= (amount - balance);
			 	balance = 0;
			 	
		    }
			else{
				throw new OverdraftException("Insufficient funds for overdraft protection", amount - balance);
				
	        }
		}
		
	}
}
