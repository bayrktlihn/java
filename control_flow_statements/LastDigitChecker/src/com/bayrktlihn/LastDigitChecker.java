package com.bayrktlihn;

public class LastDigitChecker {
	public static boolean hasSameLastDigit(int num1, int num2, int num3) {

		if (isValid(num1) && isValid(num2) && isValid(num3)) {
			int num1LastDigit = num1 % 10;
			int num2LastDigit = num2 % 10;
			int num3LastDigit = num3 % 10;
			return num1LastDigit == num2LastDigit || num2LastDigit == num3LastDigit || num1LastDigit == num3LastDigit;
		}
		return false;
	}

	public static boolean isValid(int num) {
		return num > 9 && num < 1001;
	}

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));
	}
}
