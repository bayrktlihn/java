package com.bayrktlihn;

public class FlourPacker {
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		
		if(bigCount < 0 || smallCount < 0 || goal < 0)
			return false;
		
		
		while(goal > 0) {
			
			if(goal / 5 > 0) {
				if(bigCount > 0 )
					bigCount--;
				else if(smallCount > 4)
					smallCount -= 5;
				else
					return false;
				goal -= 5;
			}
			else {
				if(smallCount > 0)
					smallCount--;
				else
					return false;
				goal--;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(1, 0, 5));
		System.out.println(canPack(0, 5, 4));
		System.out.println(canPack(2, 2, 11));
		System.out.println(canPack(0, 10, 10));
		System.out.println(canPack(-3, 2, 12));
	}
}
