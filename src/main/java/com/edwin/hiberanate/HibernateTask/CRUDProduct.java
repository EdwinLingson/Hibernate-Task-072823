package com.edwin.hiberanate.HibernateTask;

import org.hibernate.Session;

import com.edwin.hiberanate.HibernateTask.entity.Product;

public class CRUDProduct {
	
	static Session session = HibernateUtil.getSession();;
	public CRUDProduct() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}
	//C
	static void insertProduct(Product product) {
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
	}
	//U
	static void updateProduct(Product product) {
		session.beginTransaction();
		session.update(product);
		session.getTransaction().commit();
	}
	//R
	static Product readProdcuct(int pId) {
		return session.get(Product.class, pId);
	}
	//D
	static void deleteProduct(int pId)
	{
		session.beginTransaction();
		session.delete(readProdcuct(pId));
		session.getTransaction().commit();
	}
}
