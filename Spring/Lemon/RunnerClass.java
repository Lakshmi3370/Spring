package com.xworkz.lemon.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.lemon.lemonbean.LemonBean;

public class RunnerClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		LemonBean bean =(LemonBean) context.getBean("bean");
		
		bean.maataMantra();
		bean.display();
		

	}

}
