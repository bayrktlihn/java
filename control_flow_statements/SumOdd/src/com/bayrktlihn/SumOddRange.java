package com.bayrktlihn;

public class SumOddRange {
	public static boolean isOdd(int number) {
		if(number > 0)
			return number % 2 == 1;
		return false;
	}

	public static int sumOdd(int start, int end) {
		if (start > end)
			return -1;
		if (start < 0 || end < 0)
			return -1;

		int sum = 0;

		for (int i = start; i < end + 1; i++) {
			if (isOdd(i))
				sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(13, 13));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));
	}
}
