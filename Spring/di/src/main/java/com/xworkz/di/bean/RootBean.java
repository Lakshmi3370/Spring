package com.xworkz.di.bean;

import lombok.Data;

@Data
public class RootBean {
	
	private String typeOfSoil;

	public void stability() {
		System.out.println("Its used give stability to tree");
	}

	public void absorbNutrients() {
		System.out.println("it absorb nutrients to stability to tree");
	}


}
