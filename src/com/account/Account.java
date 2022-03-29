package com.account;

public class Account {

	 static double balance = 100;

	public static void main(String[] args) {
		Account act = new Account();
		act.credit(balance);
		act.account(balance);
		act.debit(balance);
		
		
	}

	public void credit(double amount) {
		amount = 100;
		balance = balance + amount;
		System.out.println("Credit Balance is " + balance);
	}

	public void account(double initialBalance) {
		if (initialBalance > 0.0) {
			balance = initialBalance;
			System.out.println("Account Balance is " + balance);
		}
	}

	public void debit(double debitAmount) {

		if (debitAmount > balance) {
			System.out.println("Debit amount exceeded account balance.");
		}
		balance = balance - debitAmount;
		System.out.println("Debit amount exceeded account balance." + balance);
	}
}
