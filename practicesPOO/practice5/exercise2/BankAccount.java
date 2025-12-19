package practicesPOO.practice5.exercise2;

public class BankAccount {
    private final int accountNumber;
    private String holderName;
    private double balance;

    BankAccount(int accountNumber, String holderName, double initialDeposit){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        deposit(initialDeposit);
    }

    BankAccount(int accountNumber, String holderName){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    //Getters
    public int getAccountNumber() {return accountNumber;}
    public String getHolderName() {return  holderName;}
    public double getBalance() {return balance;}

    //Set
    public void setHolderName(String holderName) {this.holderName = holderName;}

    //Deposit
    public void deposit(double value){
        if(value<0){
            System.out.println("Deposit value can not be negative");
            return;
        }

        balance += value;
    }

    //Withdraw
    public void withdraw(double value){
        if(balance - (value+5) < 0) {
            System.out.println("You don't have enough money to  withdraw");
            return;
        }

        balance -= (value+5);
    }

    //Override toString
    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f", accountNumber, holderName, balance);
    }
}
