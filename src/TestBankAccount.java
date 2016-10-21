/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class TestBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Account 1
        // Diplaying Information
        BankAccount a1 = new BankAccount("Richards", 1234, 100);
        System.out.println("A1 Account: " + a1.getAccountNumber());
        System.out.println("A1 Initial balance: " + "$" + a1.checkFunds());
        // Taking and Putting in Money
        a1.deposit(1000);
        System.out.println("Balance: " + "$" + a1.checkFunds());
        a1.withdraw(300);
        System.out.println("Balance: " + "$" + a1.checkFunds());
        System.out.println("");
        
        // Account 2
        // Diplaying Information
        BankAccount a2 = new BankAccount("Another", 1234, 1000);
        System.out.println("A2 Account: " + a2.getAccountNumber());
        System.out.println("A2 Initial balance: " + a2.checkFunds());
               
        System.out.println("");
        a1.transferFundsTo(a2, 100);
        System.out.println("A1 balance: " + a1.checkFunds());
        System.out.println("A2 balance: " + a2.checkFunds());
    }
}
