package com.xworkz.vehicle;

import lombok.Data;

@Data
public class CarBean {
	private String brand;
	private int cost;
	
	
	public void printAll() {
		System.out.println(brand+" "+cost);
	}

}
