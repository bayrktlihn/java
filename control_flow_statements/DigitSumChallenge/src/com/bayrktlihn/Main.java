package com.bayrktlihn;

public class Main {
	public static void main(String[] args) {
		System.out.println("The sum of the digits in number 125 is "+sumDigits(125));
		System.out.println("The sum of the digits in number -125 is "+sumDigits(-125));
		System.out.println("The sum of the digits in number 4 is "+sumDigits(4));
		System.out.println("The sum of the digits in number 321321 is "+sumDigits(321321));
	}

	private static int sumDigits(int number) {
		
		if(number < 10)
			return -1;
		
		int sum = 0;

		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}
}
