package com.bayrktlihn;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String[] strArray = new String[10];
		int[] intArray = new int[10];

		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("Alihan");

//		ArrayList<int> intArrayList = new ArrayList<int>();
		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(54));
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.25);

		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			intArrayList.add(Integer.valueOf(i));
		}

		for (int i = 0; i < intArrayList.size(); i++) {
			System.out.println(i + " --> " + intArrayList.get(i).intValue());
		}

		Integer myIntValue = 56; // Integer.valueOf(56);
		int myInt = myIntValue.intValue(); // myIntValue.intValue();

		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		for (double i = 0; i < 10; i += 0.5) {
			myDoubleValues.add(i);
		}
		
		for (int i = 0; i < myDoubleValues.size(); i++) {
			System.out.println(i + " --> " + myDoubleValues.get(i));
		}
		

	}
}

class IntClass {
	private int myValue;

	public IntClass(int myValue) {
		super();
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}

}
