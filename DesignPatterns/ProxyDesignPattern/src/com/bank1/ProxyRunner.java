package com.bank1;

import java.util.Scanner;

public class ProxyRunner {
	
	public static void main(String[] args) {
		
	
		BankAccount2 balance=new BankAccount2("Dora", "Dora@123",1000);
		balance.deposit(5000);
		balance.getBalance();
		System.out.println("  Your current balance ="+balance.getBalance());
		
		
		/*
		 * BankAccount2 balance1=new BankAccount2("Dora", "Do@123",1000);
		 * balance.deposit(5000); balance.getBalance();
		 * System.out.println("  Your current balance ="+balance.getBalance());
		 */
	}

}
