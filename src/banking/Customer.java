package banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	
	private String firstName;
	private String lastName;
	private List<Account> accounts;
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	/**
	 * 消费者的构造器
	 * @param f is fistName
	 * @param l is lastName
	 */
	public Customer(String f, String l){
		this.firstName = f;
		this.lastName = l;
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account acc){
		accounts.add(acc);
	}
	public Account getAccount(int index){
		return accounts.get(index);
	}
	
	public int getNumOfAccounts(){
		return accounts.size();
	}
	
	public Iterator<Account> getAccounts() {
		return accounts.iterator();
	}
//	public void setAccount(Account account){
//		this.account = account;
//	}
}
