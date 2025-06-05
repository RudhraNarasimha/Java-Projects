package com.project.model;

public abstract class Account {
	private String accnumber;
	private Customer customer;
	private double balance;

	public Account(String accnumber, Customer customer, double balance) {
		super();
		this.accnumber = accnumber;
		this.customer = customer;
		this.balance = balance;
	}

	public String getAccnumber() {
		return accnumber;
	}

	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public abstract void withdraw(double amount);

	@Override
	public String toString() {
		return "Account [accnumber=" + accnumber + ", customer=" + customer + ", balance=" + balance + "]";
	}

}