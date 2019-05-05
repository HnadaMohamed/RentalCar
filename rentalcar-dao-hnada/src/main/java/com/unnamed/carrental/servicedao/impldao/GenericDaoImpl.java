package com.unnamed.carrental.servicedao.impldao;

import java.util.List;


import org.hibernate.Session;

import com.unnamed.carrental.servicedao.GenericDao;
import com.unnamed.carrental.util.HibernateUtil;

public class GenericDaoImpl<T> implements GenericDao<T> {

	public Class<T> Type ;

	

	@Override
	public T create(T type) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(type);
		session.getTransaction().commit();
		session.close();
		return type;
	}

	@Override
	public T update(Long id, T type) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(type);
		session.getTransaction().commit();
		session.close();
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getById(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		T t = (T) session.get(Type ,id);
		session.close();
		return t;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		List<T> list = session.createQuery("from " + Type.getName()).list();
		session.close();
		return list;
	}

	@Override
	public void delete(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.delete(getById(id));
		session.close();
		
	}
	
	
	

}


























//public class CrudServiceImpl<T> implements CrudService<T> {
//
//	
//	
//	@Override
//	public T create(T type) {
//
//		// creating configuration object
//		Configuration cfg = new Configuration();
//
//		// populates the data of the configuration file
//		cfg.configure("hibernate.cfg.xml");
//
//		// creating session factory object
//		SessionFactory factory = cfg.buildSessionFactory();
//
//		// creating session object
//		Session session = factory.openSession();
//
//		Transaction trans = session.beginTransaction();
//
//		// persisting the object
//		session.persist(type);
//
//		// transaction is commit
//		trans.commit();
//		session.close();
//
//		System.out.println("successfully saved");
//
//		return type;
//	}
//
//	@Override
//	public T update(Long id, T type) {
//		
//		// creating configuration object
//		Configuration cfg = new Configuration();
//
//		// populates the data of the configuration file
//		cfg.configure("hibernate.cfg.xml");
//
//		// creating session factory object
//		SessionFactory factory = cfg.buildSessionFactory();
//
//		// creating session object
//		Session session = factory.openSession();
//
//		Transaction trans = session.beginTransaction();
//
//		// persisting the object
//		session.update(type);
//
//		// transaction is commit
//		trans.commit();
//		session.close();
//
//		System.out.println("successfully saved");
//
//		return null;
//	}
//
//	@Override
//	public T getById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<T> getAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void delete(Long id) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
