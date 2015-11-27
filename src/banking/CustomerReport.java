package banking;

import java.util.Iterator;

public class CustomerReport{
	public void generateReport() {
		
		Bank bank = Bank.getBank();
		Customer customer = null;
		
		Iterator<Customer> customers = bank.getCustomers();
		String account_type;
		
		// Generate a report
		System.out.println("\t\t\tCUSTOMERS REPORT");
		System.out.println("\t\t\t================");
		
		while(customers.hasNext())
		{
			customer = customers.next();
			
			System.out.println();
			System.out.println("Customer:" + customer.getFirstName() + ", " + customer.getLastName());
			
			Iterator<Account> accounts = customer.getAccounts();
			while(accounts.hasNext()){
				Account account = accounts.next();
				account_type = "";
				
				if (account instanceof SavingAccount){
					account_type = "Savings Account";
				}else if(account instanceof CheckingAccount){
					account_type = "Checking Account";
				}
				
				System.out.println( account_type + ": current balance is гд" + account.getBalance());
		
			}
		}
	}
}
