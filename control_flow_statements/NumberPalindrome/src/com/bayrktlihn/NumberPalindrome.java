package com.bayrktlihn;

public class NumberPalindrome {
	public static boolean isPalindrome(int number) {
		
		if(number < 0)
			number = -number;
		
		int tmpNumber = number;
		int reverseNumber = tmpNumber % 10;
		tmpNumber /= 10;
		
		while(tmpNumber > 0) {
			reverseNumber *= 10;
			reverseNumber += tmpNumber % 10;
			tmpNumber /= 10;
			
		}
		
		return reverseNumber == number;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
	}
}
