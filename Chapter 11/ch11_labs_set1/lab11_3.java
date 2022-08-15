// Shawn Aviles 4/14/2021

// program tests the Account, SavingsAccount, and CheckingAccount Classes
public class lab11_3 {
    public static void main(String[] args) {
		// create Account object and set annual interest
		Account account = new Account(101, 100000);
        account.setAnnualInterestRate(1.5);

        // create SavingsAccount object and set annual interest
		SavingsAccount savings = new SavingsAccount(102, 20000);
        savings.setAnnualInterestRate(1.5);

        // create CheckingAccount object and set annual interest
		CheckingAccount checking = new CheckingAccount(103, 100000, -100);
        checking.setAnnualInterestRate(1.5);

		// Withdraw & Deposit from each account
		account.withdraw(5000);
		savings.withdraw(5000);
		checking.withdraw(5000);
		account.deposit(7500);
		savings.deposit(7500);
		checking.deposit(7500);

		// display results and exit program
        String result = account.toString() + "\n" + savings.toString() + "\n" + checking.toString();
        System.out.println(result);
		System.exit(0);
	}
}
