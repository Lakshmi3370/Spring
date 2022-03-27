package com.xworkz.springWithHibernate.runner;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springWithHibernate.dao.CafeDAOImpli;
import com.xworkz.springWithHibernate.dto.CafeDTO;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		CafeDAOImpli cafedao = context.getBean(CafeDAOImpli.class);

		CafeDTO dtos = new CafeDTO();
		dtos.setId(2);
		dtos.setLocation("Bangalore");
		dtos.setMenu("Coffee");
		dtos.setPrice(30);
		dtos.setReview(4.2);

		//cafedao.save(dtos);
		//System.out.println(dtos);

		System.out.println("Saved Successfully");
		List<CafeDTO> list = cafedao.list();

		for (CafeDTO cafedto : list) {
			System.out.println("Cafe List::" + cafedto);
		}

	}

}
