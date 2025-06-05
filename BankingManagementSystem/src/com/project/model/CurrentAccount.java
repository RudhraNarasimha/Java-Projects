package com.project.model;

public class CurrentAccount extends Account {
	private static final double OVER_DRAFT_LIMIT = -10000.00;

	public CurrentAccount(String accnumber, Customer customer, double balance) {
		super(accnumber, customer, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount >= OVER_DRAFT_LIMIT) {
			setBalance(getBalance() - amount);
			System.out.println("Withdraw success........");
		} else {
			System.out.println("not success.......");
		}
	}

}