package test;

import banking.*;

public class TestBanking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Customer customer;
//		Account account;
//		Bank bank = new Bank();
//		
//		System.out.println("Creating the customer Jane Smith.");
//		System.out.println("Creating her account with a 500.00 balance.");
//		
//		customer = new Customer("Jane", "Smith");		
//		customer.setAccount(new Account(500.00));
//		account = customer.getAccount();
//		
//		//Perform some account transactions
//		System.out.println("WithDraw 150.00: " + account.withdraw(150.00));
//		System.out.println("Deposit 22.50: " + account.deposit(22.50));
//		System.out.println("WithDraw 47.62: " + account.withdraw(47.62));
//		System.out.println("WithDraw 400.00: " + account.withdraw(400.00));
//
//		System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName() + "]"
//		+ " has a balance of " + customer.getAccount().getBalance());
//		////////////////////////////////////////////////////////////////////////////
//		bank = new Bank();
//		bank.addCustomer("Jane", "Simms");
//		bank.addCustomer("Owen", "Bryant");
//		bank.addCustomer("Tim", "Soley");
//		bank.addCustomer("Maria", "Soley");
//		
//		for(int i = 0; i < bank.getNumOfCustomers(); i++) {
//			Customer cus = bank.getCustomer(i);
//			System.out.println("Cumstomer [" + (i+1) +"] is " + cus.getLastName() + "," + cus.getFirstName());
//		}
//		/////////////////////////////////////////////////////////////////////////////
//		System.out.println("Creating the customer Jane Smith.");
//		bank.addCustomer("Jane", "Simms");
//		System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
//		bank.getCustomer(0).setAccount(new SavingAccount(500.00, 0.03));
//		
//		System.out.println("Creating the customer Owen Bryant.");
//		bank.addCustomer("Owen", "Bryant");
//		customer = bank.getCustomer(1);
//		System.out.println("Creating his Checking Account with a 500.00 balance and no overdraft protection.");
//		customer.setAccount(new CheckingAccount(500.00));
//		
//		System.out.println("Creating the customer Tim Soley.");
//		bank.addCustomer("Tim", "Soley");
//		customer = bank.getCustomer(2);
//		System.out.println("Creating his Checking Account with a 500.00 balance and 500.00 in overdraft protection.");
//		customer.setAccount(new CheckingAccount(500.00, 500.00));
//		
//		System.out.println("Creating the customer Maria Soley.");
//		bank.addCustomer("Maria", "Soley");
//		customer = bank.getCustomer(3);
//		System.out.println("Maria shares her Checking Account with her husband Tim.");
//		customer.setAccount(bank.getCustomer(2).getAccount());
//		
//		System.out.println();
//		
//
//		// Test a standard Savings Account
//		System.out.println("Retrieving the customer Jane Smith with her savings account.");
//		customer = bank.getCustomer(0);
//		account = customer.getAccount();
//		// Perform some account transactions
//		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
//		System.out.println("Deposit 22.50: " + account.deposit(22.50));
//		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
//		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
//		// Print out the final account balance
//		System.out.println("Customer [" + customer.getLastName() + ", "
//						+ customer.getFirstName() + "] has a balance of "
//						+ account.getBalance());
//
//		System.out.println();
//
//		// Test a Checking Account w/o overdraft protection
//		System.out.println("Retrieving the customer Owen Bryant with his checking account with no overdraft protection.");
//		customer = bank.getCustomer(1);
//		account = customer.getAccount();
//	    // Perform some account transactions
//		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
//		System.out.println("Deposit 22.50: " + account.deposit(22.50));
//		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
//		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
//		// Print out the final account balance
//		System.out.println("Customer [" + customer.getLastName() + ", "
//						+ customer.getFirstName() + "] has a balance of "
//						+ account.getBalance());
//
//		System.out.println();
//
//		// Test a Checking Account with overdraft protection
//		System.out.println("Retrieving the customer Tim Soley with his checking account that has overdraft protection.");
//		customer = bank.getCustomer(2);
//		account = customer.getAccount();
//		// Perform some account transactions
//		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
//		System.out.println("Deposit 22.50: " + account.deposit(22.50));
//		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
//		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
//		// Print out the final account balance
//		System.out.println("Customer [" + customer.getLastName() + ", "
//						+ customer.getFirstName() + "] has a balance of "
//						+ account.getBalance());
//
//		System.out.println();
//
//		// Test a Checking Account with overdraft protection
//		System.out.println("Retrieving the customer Maria Soley with her joint checking account with husband Tim.");
//		customer = bank.getCustomer(3);
//		account = customer.getAccount();
//		// Perform some account transactions
//		System.out.println("Deposit 150.00: " + account.deposit(150.00));
//		System.out.println("Withdraw 750.00: " + account.withdraw(750.00));
//		// Print out the final account balance
//		System.out.println("Customer [" + customer.getLastName() + ", "
//						+ customer.getFirstName() + "] has a balance of "
//						+ account.getBalance());
//		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//testbanking5_1
		Bank bank = Bank.getBank();
		Customer customer;
		
		CustomerReport customerReport = new CustomerReport();
		
		//create several customers and their accounts
		bank.addCustomer("Jane", "Simms");
		customer = bank.getCustomer(0);		
		customer.addAccount(new SavingAccount(500.00, 0.05));
		customer.addAccount(new CheckingAccount(200.00, 400.00));
		
		bank.addCustomer("Owen", "Bryant");
		customer = bank.getCustomer(1);
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer("Tim", "Soley");
		customer = bank.getCustomer(2);
		customer.addAccount(new SavingAccount(1500.00, 0.05));
		customer.addAccount(new CheckingAccount(200.00));
		
		bank.addCustomer("Maria", "Soley");
		customer = bank.getCustomer(3);
		//Maria and Tim have the sharing checking account
		customer.addAccount(bank.getCustomer(2).getAccount(1));
		customer.addAccount(new SavingAccount(150.00, 0.05));
		
		customerReport.generateReport();
		
	}

}

