package com.app_jdbc.service;

import com.app_jdbc.entities.Book;

public interface BookService {
	public void persistObjectGraph(Book book);

	public Book retrieveObjectGraph(String isbn);
}