package com.bank;

public class BankAccountProxy implements BankAccount {
    private RealBankAccount realBankAccount;
    private String user;
    private String password;

    public BankAccountProxy(String user, String password, double initialBalance) {
        this.user = user;
        this.password = password;
        this.realBankAccount = new RealBankAccount(initialBalance);
    }

    private boolean authenticate() {
        // Simple authentication logic for demonstration
        return "user123".equals(user) && "pass123".equals(password);
    }

    @Override
    public void deposit(double amount) {
        if (authenticate()) {
            realBankAccount.deposit(amount);
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (authenticate()) {
            realBankAccount.withdraw(amount);
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }

    @Override
    public double getBalance() {
        if (authenticate()) {
            return realBankAccount.getBalance();
        } else {
            System.out.println("Authentication failed. Access denied.");
            return 0;
        }
    }
}
