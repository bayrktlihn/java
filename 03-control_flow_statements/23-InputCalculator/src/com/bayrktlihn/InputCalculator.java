package com.bayrktlihn;

import java.util.Scanner;

public class InputCalculator {
	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		
		int sizeOfNumber = 0;
		int sum = 0;

		while(true) {
			boolean hasNextInt = scanner.hasNextInt();
			
			if(hasNextInt) {
				sizeOfNumber++;
				int number = scanner.nextInt();
				sum += number;
			}
			else {
				break;
			}
			
			scanner.nextLine();
		}
		scanner.close();
		
		System.out.printf("SUM = %d AVG = %d\n", sum, Math.round(((double) sum) / sizeOfNumber ));
		
	}
}
