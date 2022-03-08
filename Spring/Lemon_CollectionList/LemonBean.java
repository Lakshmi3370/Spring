package com.xworkz.lemon.lemonbean;

import java.util.Iterator;
import java.util.List;

public class LemonBean {
	
	private List <String> mantravadiName;
	private String location;
	

	public LemonBean(List <String> mantravadiName) {
		this.mantravadiName = mantravadiName;
	}
	
	public void display() {
		System.out.println("Mantravadi Names");
		Iterator<String> itr = mantravadiName.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void maataMantra() {
	System.out.println("Get maatamantra details");

	}
	}


