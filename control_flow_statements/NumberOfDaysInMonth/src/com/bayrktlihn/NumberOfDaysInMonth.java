package com.bayrktlihn;

public class NumberOfDaysInMonth {
	public static boolean isLeapYear(int year) {
		if (year > 0 && year < 10000) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0)
						return true;
					return false;
				}
				return true;
			}
			return false;
		}
		return false;
	}

	public static int getDaysInMonth(int month, int year) {
		if (month < 1 || month > 12 || year < 1 || year > 9999)
			return -1;

		if (month == 2) {
			if (isLeapYear(year)) {
				return 29;
			}
			return 28;
		} else if (month == 1 || month == 5 || month == 3 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		return 30;

	}

	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
	}
}
