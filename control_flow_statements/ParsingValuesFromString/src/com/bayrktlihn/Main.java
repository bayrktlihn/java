package com.bayrktlihn;

public class Main {
	public static void main(String[] args) {
		String numberAsString = "2018";
		System.out.println("numberAsString = "+numberAsString);
		
		int number = Integer.parseInt(numberAsString);  // Double.parseDouble(var) or Float.parseFloat(var) ...
		System.out.println("number = "+number);
		
		numberAsString += 1;
		number += 1;
		
		System.out.println("numberAsString = "+numberAsString);
		System.out.println("number = "+number);
		
		
	}
}
