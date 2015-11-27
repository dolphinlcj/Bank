package banking;

import java.util.*;

/**
 * 代表银行对象
 * @author lcj
 *
 */
public class Bank {
	
	private List<Customer> customers;

	private Bank() {
		customers = new ArrayList<Customer>();
	}
	
	private static Bank bankInstance = new Bank();
	
	public static Bank getBank() {
		return bankInstance;
	}
	
	public void addCustomer(String f, String l) {
		Customer customer = new Customer(f, l);
		customers.add(customer);
	}
	
	public int getNumOfCustomers() {
		
		return customers.size();
	}
	
	public Customer getCustomer(int index) {
		
		return customers.get(index);
	}
	
	public Iterator<Customer> getCustomers() {
		return customers.iterator();
	}
	
}
