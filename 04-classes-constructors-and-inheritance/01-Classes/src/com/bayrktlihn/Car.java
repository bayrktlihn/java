package com.bayrktlihn;

public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;

	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("carrera") || validModel.equals("commondore"))
			this.model = model;
		else
			this.model = "Unknow";
	}

	public String getModel() {
		return this.model;
	}
}
