package webank;

// === Base class ===

public abstract class Account {
	
	private int accountNumber;
	protected double balance;
	
	public Account() {
		
	}
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	// === function to deposit amount ===
	public abstract void deposit(int amount);

	// === function to withdraw funds amount ===
	public abstract void withdraw(double amount);
	
	/*
	 * withdrawal is only valid if balance is > 0 
	 */
	
}
