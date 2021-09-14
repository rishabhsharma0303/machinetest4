package com.app_jdbc.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app_jdbc.dao.factory.HibernateSessionFactory;
import com.app_jdbc.entities.Book;

public class BookDaoImpl implements BookDao {
	private SessionFactory factory;

	public BookDaoImpl() {
	factory = HibernateSessionFactory.getSessionFactory();
	}

	public Session getSession() {
		return factory.openSession();
	}
	public void persistObjectGraph(Book book) {
		// TODO Auto-generated method stub

		Session session = getSession();
		 
	
		 Transaction tx= session.getTransaction();
		 
		 try {
			 tx.begin();
//			 session.save(customer);
//			 session.save(customer1);
			 session.save(book);
			 System.out.println("---------------------");
			 tx.commit();
		
		 }catch(HibernateException ex) {
			 ex.printStackTrace();
			 tx.rollback();
		 }
		 session.close();
		 factory.close();
	}

	public Book retrieveObjectGraph(String isbn) {
Session session = factory.openSession();
		
		Book book = session.get(Book.class, isbn);
	
		System.out.println(book);
	
		session.close();
		
		factory.close();
		return book;
	}

}
