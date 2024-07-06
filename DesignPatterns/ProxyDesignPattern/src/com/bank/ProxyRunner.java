
package com.bank;

public class ProxyRunner {
    public static void main(String[] args) {
   
    	BankAccount account = new BankAccountProxy("user123", "pass123", 1000);

        account.deposit(200);
        account.withdraw(150);
        System.out.println("Balance: " + account.getBalance());

        // Trying to access with wrong credentials
        BankAccount accountWithWrongCredentials = new BankAccountProxy("user123", "wrongpass", 1000);
        accountWithWrongCredentials.deposit(200);
        System.out.println("Balance: " + accountWithWrongCredentials.getBalance());
        
        
        
        BankAccount account1 = new BankAccountProxy("user123", "pass123", 1000);

        account.deposit(200);
        account.withdraw(150);
        System.out.println("Balance: " + account.getBalance());
    }
}

