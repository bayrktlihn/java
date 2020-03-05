package com.bayrktlihn;

public class PerfectNumber {
	public static boolean isPerfectNumber(int number) {
		if (number < 1)
			return false;

		int sum = 1;

		for (int i = 2; i < (number / 2) + 1; i++) {
			if (number % i == 0)
				sum += i;
		}

		return sum == number;
	}

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));
		System.out.println(isPerfectNumber(28));
		System.out.println(isPerfectNumber(5));
		System.out.println(isPerfectNumber(-1));
	}
}
