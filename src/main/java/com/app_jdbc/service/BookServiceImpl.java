package com.app_jdbc.service;

import com.app_jdbc.dao.BookDao;
import com.app_jdbc.dao.BookDaoImpl;
import com.app_jdbc.entities.Book;

public class BookServiceImpl implements BookService {
private BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao=new BookDaoImpl();
	}
	
	public void persistObjectGraph(Book book) {
		 bookDao.persistObjectGraph(book);
		
	}

	public Book retrieveObjectGraph(String isbn) {
		// TODO Auto-generated method stub
		 return bookDao.retrieveObjectGraph(isbn);
	}

}
