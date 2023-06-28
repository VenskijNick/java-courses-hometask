package hometask6;

public class CreditCard {
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addFunds(double amount) {
        balance += amount;
    }

    public void withdrawFunds(double amount) {
        if (amount > balance) {
            System.out.println("Not enough funds");
        } else {
            balance -= amount;
        }
    }

    public void printInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}