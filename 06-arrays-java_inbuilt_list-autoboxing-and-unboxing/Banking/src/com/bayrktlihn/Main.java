package com.bayrktlihn;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank("National Australia Bank");
		
		if(bank.addBranch("Adelaide")) {
			System.out.println("Adelaide branch created");
		}
		
		bank.addCustomer("Adelaide", "Alihan", 50.05);
		bank.addCustomer("Adelaide", "Chad", 175.34);
		bank.addCustomer("Adelaide", "Sadık", 220.12);
		
		bank.addBranch("Sydney");
		bank.addCustomer("Sydney", "Sadi Evren", 150.54);
		
		bank.addCustomerTransaction("Adelaide", "Alihan", 44.22);
		bank.addCustomerTransaction("Adelaide", "Chad", 12.44);
		bank.addCustomerTransaction("Adelaide", "Deniz", 1.65);
		
		bank.listCustomers("Adelaide", true);
		bank.listCustomers("Sydney", true);
		
		bank.addBranch("Melbourne");
		if(!bank.addCustomer("Melbourne", "Mimar", 5.53)) {
			System.out.println("Error Melbourne branch does not exist");
		}
		
		if(!bank.addBranch("Adelaide")) {
			System.out.println("Adelaide branch already exists");
		}
		
		if(!bank.addCustomerTransaction("Adelaide", "Engin", 52.33)) {
			System.out.println("Customer does not exist at branch");
		}
		
		if(!bank.addCustomer("Adelaide", "Alihan", 11.21)) {
			System.out.println("Customer Alihan already exists");
		}
	}
}
