package webank;

public class CheckingAccount extends Account {
	
	// == default transaction fee == 
	private static double fee = 1.5;
	
	public CheckingAccount() {
		super();
	}
	public CheckingAccount(int accountNumber, double fee) {
		super(accountNumber);
		fee = fee;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.printf("Amount %.2f deposited %n", amount);
			
			// Apply transaction fee 
			balance -= fee;
			System.out.printf("Transaction %.2f fee applied:", fee);
			System.out.printf("Current balance is: %.2f%n:", balance);
			
		} else {
			System.out.println("Cannot deposit a negative amount");
		}
	}

	public void withdraw(double amount) {
		if(amount > 0) {
			// check sufficient balance
			if((amount + fee) <= balance) {
				System.out.printf("Amount of %.2f withdrawn from Account %n", amount);
				balance -= amount;
				balance -= fee;
				System.out.printf("Fee of %.2f applied", fee);
				System.out.printf("Current balance: %.2f%n", balance);
			}
		} else {
			System.out.println("Negative amount cannot be withdrawn");
		}
	}
}
