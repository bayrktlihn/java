package com.bayrktlihn;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int [] myIntegers = getIntegers(5);
		
		for(int i = 0; i<myIntegers.length; i++) {
			String msg = String.format("Element %d typed value was %d", i, myIntegers[i]);
			System.out.println(msg);
		}
		
		System.out.println("The average is "+getAverage(myIntegers));
	}

	private static int[] getIntegers(int number) {
		System.out.printf("Enter %d number integer values.\r\n", number);
		int [] values = new int[number];
		
		for(int i = 0; i<values.length; i++) {
			values[i] = sc.nextInt();
		}
		
		return values;
	}
	
	private static double getAverage(int [] array) {
		double sum = 0;
		for(int i = 0; i<array.length; i++)
			sum += array[i];
		return sum / array.length;
	}

}
