package com.bayrktlihn;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int [] myIntegers = getIntegers(5);
		int [] sorted = sortIntegers(myIntegers);
		printArray(sorted);
	}

	private static int[] getIntegers(int number) {
		int[] array = new int[number];

		System.out.printf("Enter %d number integer values:\r\n", number);

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		return array;
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			String msg = String.format("Element %d contents %d", i, array[i]);
			System.out.println(msg);
		}
	}

	private static int[] sortIntegers(int[] array) {
		
//		int [] sortedArray = new int[array.length]; 
//		
//		for(int i = 0; i<sortedArray.length; i++) {
//			sortedArray[i] = array[i];
//		}
		
		int [] sortedArray = Arrays.copyOf(array, array.length);
		
		
		
//		for (int i = 0; i < sortedArray.length; i++) {
//			for (int j = i + 1; j < sortedArray.length; j++) {
//				if(sortedArray[j] > sortedArray[i] ) {
//					int tmp = sortedArray[i];
//					sortedArray[i] = sortedArray[j];
//					sortedArray[j] = tmp;
//				}
//			}
//		}
		
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i = 0; i<sortedArray.length - 1; i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					int temp = sortedArray[i+1];
					sortedArray[i+1] = sortedArray[i];
					sortedArray[i] = temp;
					flag = true;
				}
			}
		}
		
		return sortedArray;

	}
}
