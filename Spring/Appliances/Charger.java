package com.xworkz.appliances.mobile;


public class Charger {
	
	private int cost;
	
	public Charger() {
		System.out.println("Charger object get creating");
	}
	
	public Charger(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Charger [cost=" + cost + "]";
	}
	
	
}
