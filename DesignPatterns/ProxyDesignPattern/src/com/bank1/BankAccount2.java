package com.bank1;

import java.util.Scanner;

public class BankAccount2 implements BankAccount {

	private String userName;
	private String userPassword;
	private BankAcount1 bankAccount;

	public BankAccount2() {
		System.out.println("   Bank Account got generated  ....");
	}

	public BankAccount2(String userName, String userPassword, double intialBalance) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.bankAccount = new BankAcount1(intialBalance);
	}

	private boolean authenticate() {
		return "Dora"==userName && "Dora@123".equals(userPassword);
	}

	@Override
	public void deposit(double amount) {

		if (authenticate()) {
			bankAccount.deposit(amount);
		} else {
			System.out.println("Authentication failed. Access denied.");
		}
	}

	@Override
	public void withdraw(double amount) {

		if (authenticate()) {
			bankAccount.deposit(amount);
		} else {
			System.out.println("Authentication failed. Access denied.");
		}

	}

	@Override
	public double getBalance() {

		if (authenticate()) {
			System.out.println(" Your authentically is sucessfully verified ");
			return bankAccount.getBalance();

		}

		else {
			System.out.println("  Aunthentication failed .....");
		}
		return 0;

	}

}
