package com.app_jdbc.dao;

import com.app_jdbc.entities.Book;

public interface BookDao {
	public void persistObjectGraph(Book book);
	public Book retrieveObjectGraph(String isbn);
}
