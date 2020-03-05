package com.bayrktlihn;

public class NumberToWords {
	public static int reverse(int num) {
		int reverseNum = num % 10;
		num /= 10;
		
		while(num != 0) {
			reverseNum *= 10;
			reverseNum += num % 10;
			num /=10;
		}
		
		return reverseNum;
	}
	
	public static int getDigitCount(int num) {
		
		if(num < 0)
			return -1;
		
		int digitCount = num == 0 ? 1 : 0;
		while(num > 0) {
			num /= 10;
			digitCount++;
		}
		return digitCount;
	}
	
	public static void numberToWords(int num) {
		
		if(num < 0) {
			System.out.println("Invalid Value");
			return;
		}
		
		int reverseNum = reverse(num);
		
		int digitCountOfReverseNum = getDigitCount(reverseNum);
		int digitCountOfNum = getDigitCount(num);
		
		int result = digitCountOfNum - digitCountOfReverseNum;
		
		
		
		do {
			int lastDigitOfReverseNum = reverseNum % 10;
			if(lastDigitOfReverseNum == 0)
				System.out.print("Zero ");
			else if(lastDigitOfReverseNum == 1)
				System.out.print("One ");
			else if(lastDigitOfReverseNum == 2)
				System.out.print("Two ");
			else if(lastDigitOfReverseNum == 3)
				System.out.print("Three ");
			else if(lastDigitOfReverseNum == 4)
				System.out.print("Four ");
			else if(lastDigitOfReverseNum == 5)
				System.out.print("Five ");
			else if(lastDigitOfReverseNum == 6)
				System.out.print("Six " );
			else if(lastDigitOfReverseNum == 7)
				System.out.print("Seven " );
			else if(lastDigitOfReverseNum == 8)
				System.out.print("Eight ");
			else if(lastDigitOfReverseNum == 9)
				System.out.print("Nine ");
			reverseNum /= 10;
		}while(reverseNum > 0);
		
		for(int i = 0; i<result; i++) {
			System.out.print("Zero ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println(getDigitCount(0));
		System.out.println(getDigitCount(123));
		System.out.println(getDigitCount(-12));
		System.out.println(getDigitCount(5200));
		
		System.out.println(reverse(-121));
		System.out.println(reverse(1212));
		System.out.println(reverse(1234));
		System.out.println(reverse(100));
		
		numberToWords(123);
		numberToWords(1010);
		numberToWords(1000);
		numberToWords(-12);
		numberToWords(0);
	}
}
