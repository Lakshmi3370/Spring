package com.xworkz.vehicle.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.vehicle.CarBean;

public class RunnerClass {

	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	CarBean bean = context.getBean(CarBean.class);
	bean.printAll();
	
	CarBean bean1 = context.getBean(CarBean.class);
	bean1.printAll();
	
	

	}

}
