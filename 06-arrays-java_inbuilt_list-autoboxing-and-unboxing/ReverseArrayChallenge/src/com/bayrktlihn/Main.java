package com.bayrktlihn;

import java.util.Arrays;

public class Main {

	
	private static void reverse(int [] array) {
		
		int lastIndex = array.length - 1;
		
		for(int i = 0; i<array.length / 2; i++) {
			int tmp = array[i];
			array[i] = array[lastIndex-i];
			array[lastIndex-i] = tmp;
		}
		
		
	}
	
	public static void main(String[] args) {
		int [] myArray = {23,42,3421,12,5123,5123,521};
		System.out.println("Array = "+Arrays.toString(myArray));
		reverse(myArray);
		System.out.println("Reversed array = "+Arrays.toString(myArray));
		
	}
}
