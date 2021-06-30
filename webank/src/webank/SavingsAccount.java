package webank;

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount() {
		super();
	}
	//  Initialize savings account with a customer account number and interest rate
	
	public SavingsAccount(int accountNumber, double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calcInterest() {
		return balance * interestRate;
	}
	
	public void applyInterest() {
		double interest = calcInterest();
		System.out.printf("Interest amount %.2f added to balance %n", interest);
		deposit(interest);
	}

	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.printf("Amount %.2f deposited%n",amount);
			System.out.printf("Current balance: %2.f%n", balance);
		}
	}

	public void withdraw(double amount) {
		if(amount > 0) {
			// check if balance is sufficient
			if((amount) <= balance) {
				System.out.printf("Amount of %.2f withdrawn from account%n",amount);
				balance -= amount;
				System.out.printf("Current balance: %2.f%n", balance);
			} else {
				System.out.println("Negative amount cannot be withdrawn");

			}
		}
	}
}