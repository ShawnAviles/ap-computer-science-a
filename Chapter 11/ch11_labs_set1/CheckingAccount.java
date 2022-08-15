public class CheckingAccount extends Account {
	private double overdraftLimit;

	/** construct default CheckingAccount object */
	public CheckingAccount() {
		super();
		overdraftLimit = -100;
	}

	/** construct CheckingAccout with specified id, balance and overdraftLimit */
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

    /** getter/ accessor */
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	/** setter/ mutator */
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	/** method decreases balance by inputted amount */
	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) setBalance(getBalance() - amount);
		else System.out.println("ERROR. Amount withdrawn exceeds the overdraft limit.");
	}

	/** method returns String decription of class */
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + String.format("%.2f", overdraftLimit);
	}
}
