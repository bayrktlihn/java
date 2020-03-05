package com.bayrktlihn;

public class SharedDigit {
	public static boolean hasSharedDigit(int number1, int number2) {
		if ((number1 > 9 && number1 < 100) && (number2 > 9 && number2 < 100)){
			
			while(number1 > 0) {
				int lastDigitOfNumber1 = number1 % 10;
				int tmpNumber = number2;
				while(tmpNumber > 0) {
					int lastDigitOfNumber2 = tmpNumber % 10;
					if(lastDigitOfNumber1 == lastDigitOfNumber2)
						return true;
					tmpNumber /= 10;
				}
				number1 /= 10;
			}
		}

		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));
	}
}
