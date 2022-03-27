package com.xworkz.di.bean.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.di.bean.TreeBean;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		TreeBean tree = context.getBean(TreeBean.class);
		tree.provideFruits();
	}

}
