package com.bayrktlihn;

public class Main {
	public static void main(String[] args) {
//		Player player = new Player();
//		player.name = "Alihan";
//		player.health = 20;
//		player.weapon = "Sword";
//
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healtReamining());
//
//		damage = 11;
//		player.health = 200;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healtReamining());
		
		EnhancedPlayer player = new EnhancedPlayer("Alihan", 200, "Sword");
		System.out.println("Initial health is "+player.getHealth());
	}
}
