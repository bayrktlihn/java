package com.bayrktlihn;

public class LargestPrime {
	public static int getLargestPrime(int number) {
		if(number < 2)
			return -1;

		int div = 2;
		while(number != 1) {
			if(number % div == 0) {
				number /= div;
				div--;
			}
			div++;
		}
		
		return div;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(getLargestPrime(21));
		System.out.println(getLargestPrime(217));
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(45));
		System.out.println(getLargestPrime(-1));
	}
}
