import java.util.Date;

// Account Class is from lab 9.7
public class Account {
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
