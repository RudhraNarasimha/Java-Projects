package com.project.view;

import java.util.Scanner;

import com.project.services.BankingService;

public class BankingManagementSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankingService service = new BankingService();
		while (true) {
			System.out.println("*");
			System.out.println("*");
			System.out.println("*Banking Management System*");
			System.out.println("*");
			System.out.println("*");
			System.out.println("*1.Add Customer");
			System.out.println("*2.Add Account*");
			System.out.println("*3.Deposit Amount");
			System.out.println("*4.Withdraw Amount*");
			System.out.println("*5.Check Balance*");
			System.out.println("*6.View Accounts*");
			System.out.println("*");
			System.out.println("*");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter customer id:");
				String id = scanner.next();
				System.out.println("Enter customer name:");
				String name = scanner.next();
				service.createCustomer(id, name);
				break;
			case 2:
				System.out.println("Enter Account Type");
				String acc_type = scanner.next();
				System.out.println("Enter Account Number");
				String acc_number = scanner.next();
				System.out.println("Enter Customer ID");
				String cus_id = scanner.next();
				System.out.println("Enter Initial Deposit");
				double initial_deposit = scanner.nextDouble();
				service.createAccount(acc_type, acc_number, cus_id, initial_deposit);
				break;
			}
		}
	}
}