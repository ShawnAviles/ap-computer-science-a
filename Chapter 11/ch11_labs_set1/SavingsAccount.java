public class SavingsAccount extends Account {
	
	/** construct default SavingsAccount object */
	public SavingsAccount() {
		super();
	}

	/** construct SavingsAccount abject with specified id, balance */
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	/** method decreases balance by entered amount */
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else{
            setBalance(getBalance() - amount);
            System.out.println("Amount withdrawn exceeded current balance");
        }
	}
}
