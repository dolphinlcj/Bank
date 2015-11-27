package banking;

public class Account {

	protected double balance;
    public Account(double init_balance){
	this.balance = init_balance;
}

	public double getBalance(){
		return balance;
    }
	/**
	 * 存钱方法
	 * @param addBlance 存款的钱数
	 */
	public boolean deposit(double addBlance){
		this.balance += addBlance;
		
		return true;
	}
	/**
	 * 取钱方法
	 * @param subBalance 取出的钱数
	 */
//	public boolean withdraw(double subBalance){
//		
//		if(subBalance < balance){
//		    this.balance -= subBalance;
//			return true;
//		}
//		else
//			return false;
//	}
//	
	public void withdraw(double amt) {
		if(amt > balance)
			throw new OverdraftException("资金不足", amt - balance);
		this.balance -= amt;
	}
}
