package com.edwin.hiberanate.HibernateTask;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.edwin.hiberanate.HibernateTask.entity.Product;

public class HibernateUtil {

	public static Session getSession() {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Product.class);
		SessionFactory sessionFactory  =configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		
		return session;
		
		
	}
}
