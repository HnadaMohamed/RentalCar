package com.unnamed.carrental;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.unnamed.carrental.entity.Client;
import com.unnamed.carrental.servicedao.impldao.ClientDaoImpl;

public class TestHibernate {
	public static void main(String[] args) {

	
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ClientDaoImpl clientserveice = (ClientDaoImpl) context.getBean("ClientDaoImpl");
		
		
		Client c = new Client();
		c.setAdress("hhyyyy");
		c.setBirthday("14/05/1996");
		c.setFirstName("firstName");
		c.setIdClient(125);
		c.setLastName("lastName");
		c.setPhone(066415554);
		c.setSignUpDay("14/05/1235");

		Client list = clientserveice.getById(125l);

		System.out.println(list);

	}
}
