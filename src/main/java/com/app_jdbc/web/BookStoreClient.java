package com.app_jdbc.web;

import java.util.ArrayList;
import java.util.List;

import com.app_jdbc.entities.Book;
import com.app_jdbc.entities.Chapter;
import com.app_jdbc.entities.Publisher;
import com.app_jdbc.service.BookService;
import com.app_jdbc.service.BookServiceImpl;
import com.app_jdbc.service.BookStoreService;





public class BookStoreClient {
	public static void main(String[] args) {
		BookService bookStoreService = new BookServiceImpl();

		//persisting object graph
		Publisher publisher = new Publisher("MANN", "Manning Publications Co.");

		Book book = new Book("9781617290459", "Java Persistence with Hibernate, Second Edition", publisher);

		List<Chapter> chapters = new ArrayList<Chapter>();
		Chapter chapter1 = new Chapter("Introducing JPA and Hibernate", 1);
		chapters.add(chapter1);
		Chapter chapter2 = new Chapter("Domain Models and Metadata", 2);
		chapters.add(chapter2);

		book.setChapters(chapters);

		bookStoreService.persistObjectGraph(book);

		//retrieving object graph
		BookService bookService = new BookServiceImpl();
	
	
		Book book2 = bookService.retrieveObjectGraph("9781617290459");
		System.out.println(book2);
		

	}
}





