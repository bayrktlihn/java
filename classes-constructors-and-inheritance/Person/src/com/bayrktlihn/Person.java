package com.bayrktlihn;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 100)
			this.age = age;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}

	public boolean isTeen() {
		return age > 12 && age < 20;
	}

	public String getFullName() {
		if (this.firstName.isEmpty() || this.lastName.isEmpty())
			return this.firstName + this.lastName;
		return this.firstName + " " + this.lastName;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("fullName="+person.getFullName());
		System.out.println("teen= "+person.isTeen());
		person.setFirstName("Alihan");
		person.setAge(18);
		System.out.println("fullName= "+person.getFullName());
		System.out.println("teen= "+person.isTeen());
		person.setLastName("bayraktar");
		System.out.println("fullName= "+person.getFullName());
	}
}
