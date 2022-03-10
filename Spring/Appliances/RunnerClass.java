package com.xworkz.appliances.runnerclass;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.appliances.mobile.Charger;
import com.xworkz.appliances.mobile.Mobile;

public class RunnerClass {

	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	Mobile mobile = context.getBean(Mobile.class);	
	mobile.toString();
	
	Charger charger = context.getBean(Charger.class);
	charger.toString();
	
	}



}
