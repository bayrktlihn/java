package com.bayrktlihn;

public class VipPerson {
	private String name;
	private double creditLimit;
	private String emailAddress;

	public VipPerson(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public VipPerson(String name, double creditLimit) {
		this(name, creditLimit, "unknow@bayrktlihn.com");
	}

	public VipPerson() {
		this("Default name", 50000, "default@bayrktlihn.com");
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

}
