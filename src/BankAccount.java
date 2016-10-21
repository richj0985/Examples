/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class BankAccount {  
    // shared between all BankAccounts
    private static int currentAccounts = 0;
    
    // instance variables
    private double amount = 0;
    private int pin = 0000;
    private int accountNumber;
    private String name;
    
    // Constructor
    // initial setup that needs to happen before using
    public BankAccount(String name, int pin, double initBalance){
        this.amount = initBalance;
        this.name = name;
        this.pin = pin;
        
        // add 1 to create an account
        BankAccount.currentAccounts++;
        // set the account number
        this.accountNumber = BankAccount.currentAccounts;
    }
    
    // Class Methods
    
    public void withdraw(double amount){
        if(amount > 0 && this.amount >= amount){
            this.amount -= amount;
        }
    }
    
    public void deposit(double amount){
        if(amount > 0){
            this.amount += amount;
        }
    }
    
    public double checkFunds(){
        return this.amount;
    }
    
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public void transferFundsTo(BankAccount a, double amount){
        // check for proper amount
        if(this.amount >= amount){
            // do the transfer
            
            a.deposit(amount);
            // a.amount += amount;
            
            this.withdraw(amount);
            // this.amount -= amount;
        }
    }
}
