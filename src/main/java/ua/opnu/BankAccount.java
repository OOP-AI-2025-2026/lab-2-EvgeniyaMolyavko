package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee;

    void deposit(double amount) {
        if(amount>0){
            balance = balance + amount;
        }
    }

    double transactionFee(){
        transactionFee = 0.0;
        this.transactionFee = transactionFee;

        return transactionFee;
    }

    double getBalance() {
        return this.balance;
    }

    boolean withdraw(double amount) {

        if(amount>0){
            if(getBalance() >= (amount+transactionFee)){
                balance = getBalance() - (amount + transactionFee);
                return true;
            } else {
                balance = getBalance();
                return false;
            }
        }
        return false;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if(amount > 0){
            if(getBalance() >= (amount+transactionFee)){
                receiver.balance = receiver.balance + amount;
                balance = getBalance() - (amount + transactionFee);
                return true;
            } else {
                balance = getBalance();
                return false;
            }
        }
        return false;
    }
}