package com.bayrktlihn;

public class Main {
	public static void main(String[] args) {
//		int count = 1;
//		while (count != 6) {
//			System.out.println("Count value is " + count++);
//		}
		
//		count = 1;
//		while(true) {
//			if(count == 6)
//				break;
//			System.out.println("Count value is " + count++);
//		}
//
//		for (count = 1; count != 6; count++) {
//			System.out.println("Count value is " + count);
//		}
		
//		for(int i = 6; i != 6; i++) {
//			System.out.println("Count value is "+count);
//		}
//		
//		count = 1;
//		do {
//			System.out.println("Count value is "+count++);
//		}while(count != 6);
		
		int number = 4;
		int finishNumber = 20;
		int eventNumberFound = 0;
		
		while(number < (finishNumber +1)) {
			if(isEvenNumber(number)) {
				System.out.println(number);
				eventNumberFound++;
			}
			number++;	
		}
		
		System.out.println("Total even numbers found = "+eventNumberFound);
	}
	
	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;
	}
}
