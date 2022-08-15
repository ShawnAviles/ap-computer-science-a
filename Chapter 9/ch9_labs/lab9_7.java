// Shawn Aviles 2/8/2021
import java.util.Date;

// this program utilizes the Account Class to create a bank account to 
// deposit & withdraw money and display the account's balance, monthly interest
// and the date it was created
public class lab9_7 {
    public static void main(String[] args) {
        // create an Account object with specified parameters
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        
        // display results and exit program
        String display = 
        "Balance: " + account.getBalance() + 
        "\nMonthly Interest: " + account.getMonthlyInterest() +
        "\nAccount created on " + account.getDate();
        System.out.println(display);
        System.exit(0);
    }
}

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    /** default constructor */
    Account() {
    }

    /** constructor with specified id & initial balance */
    Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
    }


    /** setters */
    void setId(int newId) {
        id = newId;
    }

    void setBalance(double newBalance) {
        balance = newBalance;
    }

    void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }


    /** getters */
    int getId() {
        return id;
    }

    double getBalance() {
        return balance;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    Date getDate() {
        return dateCreated;
    }


    /** method returns monthly interest rate */
    double getMonthlyInterestRate(){
        return (annualInterestRate / 100) / 12.0;
    }

    /** method returns monthly interest */
    double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    /** method withdraws a specified amount from the account */
    void withdraw(double amount){
        balance -= amount;
    }

    /** method deposits specified amount into the account */
    void deposit(double amount){
        balance += amount;
    }
}
