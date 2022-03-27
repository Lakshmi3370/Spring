package com.xworkz.di.bean;

import lombok.Data;

@Data
public class TreeBean {
	private String fruit;
	private RootBean root;

	public TreeBean() {

	}

	public void provideFruits() {
		root.stability();
		System.out.println("Fruit name : " + fruit);
	}

	public TreeBean(String fruit, RootBean root) {
		this.fruit = fruit;
		this.root = root;
	}


}
