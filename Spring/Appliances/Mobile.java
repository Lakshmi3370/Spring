package com.xworkz.appliances.mobile;

import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private String brand;
	private Charger charger;
	
	public Mobile() {
		System.out.println("Object created");
	}

	public Mobile(String brand,Charger charger) {
		super();
		this.brand = brand;
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", charger=" + charger + "]";
	}

	
	
	
}
