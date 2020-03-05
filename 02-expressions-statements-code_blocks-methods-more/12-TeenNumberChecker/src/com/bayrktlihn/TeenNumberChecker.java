package com.bayrktlihn;

public class TeenNumberChecker {
	public static boolean hasTeen(int par1, int par2, int par3) {
		boolean result = isTeen(par1);
		result = result || isTeen(par2);
		result = result || isTeen(par3);
		return result;
	}
	
	public static boolean isTeen(int par) {
		return par > 12 && par < 20;
	}
	
	public static void main(String[] args) {
		System.out.println(hasTeen(9, 99, 19));
		System.out.println(hasTeen(23, 15, 42));
		System.out.println(hasTeen(22, 23, 34));
	}
}
