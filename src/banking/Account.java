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
	 * ��Ǯ����
	 * @param addBlance ����Ǯ��
	 */
	public boolean deposit(double addBlance){
		this.balance += addBlance;
		
		return true;
	}
	/**
	 * ȡǮ����
	 * @param subBalance ȡ����Ǯ��
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
			throw new OverdraftException("�ʽ���", amt - balance);
		this.balance -= amt;
	}
}
