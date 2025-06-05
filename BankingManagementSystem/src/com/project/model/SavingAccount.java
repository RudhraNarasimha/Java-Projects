package com.project.model;

public class SavingAccount extends Account {
	private static final double Min_Balance = 1000.00;

	public SavingAccount(String accnumber, Customer customer, double balance) {
		super(accnumber, customer, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount >= Min_Balance) {
			setBalance(getBalance() - amount);
			System.out.println("Withdraw successfully......");
		} else {
			System.out.println("Transcation Declined due to insufficient balance.....");
		}
	}

}