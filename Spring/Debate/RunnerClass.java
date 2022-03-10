package com.xworkz.debet.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.debet.debetebean.DebeteBean;


public class RunnerClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		DebeteBean bean = context.getBean(DebeteBean.class);
		bean.speech();
		

	}

}
