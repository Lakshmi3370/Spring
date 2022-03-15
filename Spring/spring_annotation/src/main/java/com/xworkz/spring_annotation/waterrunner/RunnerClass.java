package com.xworkz.spring_annotation.waterrunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring_annotation.water.FishBean;
import com.xworkz.spring_annotation.water.WaterBean;

public class RunnerClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		WaterBean bean = context.getBean(WaterBean.class);
		
		bean.printAll();
		
		
	
		//System.out.println(bean.isTransparent());
		//System.out.println(bean.getColor());
		//System.out.println(bean.getPhLevel());
		
		
		//FishBean fishBean = new FishBean("Fighter","Blue");
		//fishBean.print();
	
		
	}

}
