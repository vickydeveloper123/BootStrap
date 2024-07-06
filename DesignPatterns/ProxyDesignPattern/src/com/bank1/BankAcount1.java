package com.bank1;

public class BankAcount1 implements BankAccount {

	public double balance;
	
	public BankAcount1() {
		
		System.out.println("    Bank Details from the customer sucessfully executed ....");
	}
	
	

	public BankAcount1(double intialBalance) {
		super();
		this.balance = intialBalance;
	}



	@Override
	public void deposit(double amount) {
		System.out.println(          "Thank you for having a account in our bank ......." );
		System.out.println("  Your current balance is ="+balance);
		balance=balance+amount;
		
		System.out.println("  Deposit amount ->"+amount +"   Current balance = "+balance);
		
	}

	@Override
	public void withdraw(double amount) {
		
		if(amount<=balance) {
			balance-=amount;
			
			System.out.println(" Withdrawl Amount ="+amount+" Current balance ="+ balance);
		}
		else {
			System.out.println("  Mimum balance not there so transaction can not be done");
			System.out.println("  Please contact Bank for more Details");
			System.out.println(" Thank you ....");
		}
		
	}

	@Override
	public double getBalance() {
		return balance;
	}

}
