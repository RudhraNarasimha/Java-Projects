package com.project.services;

import java.util.LinkedHashMap;
import java.util.Map;

import com.project.model.Account;
import com.project.model.Customer;

public class BankingService {
	private Map<String, Customer> customers = new LinkedHashMap<>();
	private Map<String, Account> accounts = new LinkedHashMap<>();

	public void createCustomer(String id, String name) {
		if (customers.containsKey(id)) {
			System.out.println("Customer id already exist");
		} else {
			Customer customer = new Customer();
			customers.put(id, customer);
			System.out.println("Customer Added Successfully");
		}

	}

	public void createAccount(String acc_type, String acc_number, String cus_id, double initial_deposit) {

	}
}
