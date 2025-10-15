package com.Sheetal.Practice;

class Bank{
    private int accountNumber;
    private String accountHolder;
    private int balance;

    static int totalAccounts = 0;

    public Bank (){
        totalAccounts ++ ;
    }

    public Bank (int accountNumber,String accountHolder, int balance){
        this. accountNumber = accountNumber;
        this. accountHolder = accountHolder;
        this. balance = balance;
        totalAccounts ++;
    }

    public Bank (Bank a){
        accountNumber = a.accountNumber;
        accountHolder = a.accountHolder;
        balance = a.balance;
        totalAccounts ++;
    }

    void depositAmount(int amount){
        balance += amount;
    }

    void withdrawn(int amount){
        if (amount > balance ){
            System.out.println("Error !! ");
        }
        else{
            balance -= amount;
        }
    }

    void displayBalance (){
        System.out.println("The balance is : " + balance );
    }

}

public class BankAccount {
    static void main(String[] args) {
        Bank b1 = new Bank ();
        Bank b2 = new Bank(23234, "sheetal", 30000);
        Bank b3 = new Bank (b2);
        System.out.println("Total Accounts : " + Bank.totalAccounts);

        b1. depositAmount(2000);
        b2.withdrawn(1000);

        b1.displayBalance();
        b2.displayBalance();
        b3.displayBalance();
    }
}
