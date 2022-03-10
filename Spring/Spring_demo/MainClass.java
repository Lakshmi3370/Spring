package com.xworkz.spring_demo.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring_demo.SeasonBean;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		/*SeasonBean bean = context.getBean(SeasonBean.class);
		bean.setSeasonName("Summer");
		bean.provideClimate();
		System.out.println(bean.getSeasonName());*/
		
		SeasonBean bean = context.getBean("bean",SeasonBean.class);
		System.out.println(bean);
		
		SeasonBean bean1 = context.getBean("bean",SeasonBean.class);
		System.out.println(bean1);


	}

}
