package com.bayrktlihn;

public class Player {
	public String name;
	public int hitPoints;
	public String weapon;

	public void loseHealth(int damage) {
		this.hitPoints -= damage;
		if (this.hitPoints <= 0)
			System.out.println("Player knocked out");
	}
	
	public int healtReamining() {
		return this.hitPoints;
	}
}
