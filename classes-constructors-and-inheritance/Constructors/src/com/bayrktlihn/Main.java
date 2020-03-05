package com.bayrktlihn;

public class Main {
	public static void main(String[] args) {
//		Account alihansAccount = new Account("12345", 0, "Alihan Bayraktar", "alihanbayraktar@bayrktlihn.com","535 353 53 53");
//		Account alihansAccount = new Account();
//		System.out.println(alihansAccount.getNumber());
//		System.out.println(alihansAccount.getBalance());
//		
//		alihansAccount.withdrawal(100);
//		
//		
//		alihansAccount.deposit(50);
//		alihansAccount.withdrawal(100);
//		
//		alihansAccount.deposit(51);
//		alihansAccount.withdrawal(100);
//		
//		Account denizsAccount = new Account("Deniz", "deniz@bayrktlihn.com", "12345");
//		System.out.println(denizsAccount.getNumber()+" name "+denizsAccount.getCustomerName());
		
		VipPerson person1 = new VipPerson();
		System.out.println(person1.getName());
		
		VipPerson person2 = new VipPerson("Deniz", 25000);
		System.out.println(person2.getName());
		
		VipPerson person3 = new VipPerson("Alihan", 100, "alihan@bayrktlihn.com");
		System.out.println(person3.getName());
		System.out.println(person3.getEmailAddress());
		
	}
}
