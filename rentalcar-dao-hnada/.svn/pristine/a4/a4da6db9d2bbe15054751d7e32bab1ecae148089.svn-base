package com.unnamed.carrental.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	public static SessionFactory sessionFactory;

	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory() {
		try {
			
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			return sessionFactory;
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}
}