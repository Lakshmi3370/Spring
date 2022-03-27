package com.xworkz.springWithHibernate.dao;

import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.springWithHibernate.dto.CafeDTO;

public class CafeDAOImpli implements CafeDAO {
	
	
	private SessionFactory sessionfactory;

	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public void save(CafeDTO dto) {
		Session session = null;
		try {
			session = this.sessionfactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(dto);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public List<CafeDTO> list() {
		Session session = this.sessionfactory.openSession();
		List<CafeDTO> cafelist = session.createQuery("from CafeDTO").list();
		session.close();
		return cafelist;
	}
	
	Properties dbConnectionProperties = new Properties();
	try {
	    dbConnectionProperties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("dbConnection.properties"));
	} catch(Exception e) {
		e.printStackTrace();
	}
	sessionFactory = new Configuration().mergeProperties(dbConnectionProperties).configure().buildSessionFactory();
}
}
