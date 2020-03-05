package com.bayrktlihn;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
	}

	public static boolean isLeapYear(int year) {
		if (year > 0 && year < 10000) {
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0)
						return true;
					return false;
				}
				return true;
			}
			return false;
		}
		return false;

	}
}