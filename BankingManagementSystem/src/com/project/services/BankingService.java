package com.project.services;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import com.project.model.Account;
import com.project.model.CurrentAccount;
import com.project.model.Customer;
import com.project.model.SavingAccount;

public class BankingService {
	private Map<String, Customer> customers = new LinkedHashMap<>();
	private Map<String, Account> accounts = new LinkedHashMap<>();

	public void createCustomer(String id, String name) {
		if (customers.containsKey(id)) {
			System.out.println("Customer id already exist");
		} else {
			Customer customer = new Customer(id, name);
			customers.put(id, customer);
			System.out.println("Customer Added Successfully");
		}

	}

	public void createAccount(String acc_type, String acc_number, String cus_id, double initial_deposit) {
		if (customers.containsKey(cus_id)) {
			if (accounts.containsKey(acc_number)) {
				System.out.println("Account Already Exists.................");
			} else {
				if (acc_type.equalsIgnoreCase("savings")) {
					Customer customer = customers.get(cus_id);
					Account account = new SavingAccount(acc_number, null, initial_deposit);
					accounts.put(acc_number, account);
					System.out.println("Savings Account Created Successfully");
				} else if (acc_type.equals("current")) {
					Customer customer = customers.get(cus_id);
					Account account = new CurrentAccount(acc_number, null, initial_deposit);
					accounts.put(acc_number, account);
					System.out.println("Current Account Created Successfully");
				} else {
					System.out.println("invalid Account type");
				}
			}
		} else {
			System.out.println("Invalid Customer Id....................");
		}
	}

	public void deposit(String dep_acc_num, double dep_amount) {
		if (accounts.containsKey(dep_acc_num)) {
			Account account = accounts.get(dep_acc_num);
			account.deposit(dep_amount);
			System.out.println("Amount Deposited Successfully");
			System.out.println("Available Balance" + account.getBalance());

		} else {
			System.out.println("Invalid Account Number............... ");
		}
	}

	public void withdraw(String withdraw_acc_num, double withdraw_amount) {
		if (accounts.containsKey(withdraw_acc_num)) {
			Account account = accounts.get(withdraw_acc_num);
			account.withdraw(withdraw_amount);
			System.out.println("Amount Withdrawan Successfully");
			System.out.println("Available Balance" + account.getBalance());
		} else {
			System.out.println("Invalid Withdraw Account Number............... ");
		}
	}

	public void checkBalance(String check_acc_num) {
		if (accounts.containsKey(check_acc_num)) {
			Account account = accounts.get(check_acc_num);
			double balance = account.getBalance();
			System.out.println("Available Balance : " + balance);
		} else {
			System.out.println("Invalid Withdraw Account Number............... ");
		}

	}

	public void getAccounts() {
		Collection<Account> acclist = accounts.values();
		for (Account obj : acclist) {
			System.out.println(obj);
		}

	}

}
