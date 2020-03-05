package com.bayrktlihn;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int counter = 0;

		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;

		while (true) {
			int order = counter + 1;
			System.out.println("Enter number #" + order + ":");

			boolean isAnInt = scanner.hasNextInt();

			if (isAnInt) {
				int number = scanner.nextInt();
				counter++;
				if(number > maxValue)
					maxValue = number;
				if(number < minValue)
					minValue = number;
				
				
//				if(counter == 10)
//					break;
			} else {
				System.out.println("Invalid number");
				break;
			}

			scanner.nextLine();
		}
		
		System.out.println("maxValue = "+maxValue);
		System.out.println("minValue = "+minValue);
	}
}
