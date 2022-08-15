// Shawn Aviles 3/21/2021
import java.util.Scanner;

/* program utilizes Account Class to create ten accounts and prompts 
the user for ID. if ID accepted, main menu is displayed with 4 options:
    1. view current balance
    2. withdrawing money
    3. depositing money
    4. exiting main menu
Once system start, it will not stop */
public class lab10_7 {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // create 10 accounts with $100 initial balance
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}

        // system that does not stop
        while(true){
            //prompt user for ID
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            // determine if ID matches ID of an account to continue
            if (isValidID(id, accounts)) {
				int choice;
				do {	
					// Display main menu
                    System.out.print("\nMain menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");

                    // get user choice
					choice = input.nextInt();

                    // determine if choice is valid, if so execute transaction
					if (choice > 0 && choice < 5) execute(choice, accounts, id, input);
				} while (choice != 4);
			}
            // program does not exit, runs forever 
        }
    }

    /** method returns boolean if the entered ID is valid */
    public static boolean isValidID(int id, Account[] accounts) {
		for (int i = 0; i < accounts.length; i++) {
			if (id == accounts[i].getId()) return true;
		}
		return false;
	}

    /** method executes a transaction */
	public static void execute(int c, Account[] accounts, int id, Scanner input) {
		switch (c) {
            // current balance
			case 1: System.out.println("The balance is " + accounts[id].getBalance());
				break;
            // withdraw money
			case 2: System.out.print("Enter an amount to withdraw: "); 
				accounts[id].withdraw(input.nextDouble());
				break;
            // deposit money
			case 3: System.out.print("Enter an amount to deposit: "); 
				accounts[id].deposit(input.nextDouble());
		}
	}
}
