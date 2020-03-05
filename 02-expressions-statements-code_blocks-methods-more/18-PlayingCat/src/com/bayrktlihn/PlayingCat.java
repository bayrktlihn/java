package com.bayrktlihn;

public class PlayingCat {
	public static boolean isCatPlaying(boolean summer, int temperature){
		int upperLimit = summer ? 45 : 35;
		if(temperature > 24 && temperature < upperLimit + 1) 
			return true;
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
	}
}
