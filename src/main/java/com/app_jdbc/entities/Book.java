package com.app_jdbc.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;


@Entity
@Table(name = "Book")
public class Book {
	@Id
	@Column(name="ISBN",nullable = false,length = 50)
	private String isbn;
	@Column(name="BOOK_NAME",nullable = false,length = 100)
	private String name;
	@Column(name="PUBLISHER_CODE",nullable = false,length = 4)

	
	@ManyToOne()
	@JoinColumn(name = "publisher_fk")
	private Publisher publisher;


	@BatchSize(size=2)
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY)
	private List<Chapter> chapters;
	
	public Book() {}
	public Book(String isbn, String name, Publisher publisher) {
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public List<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", publisher="
				+ publisher + ", chapters=" + chapters + "]";
	}
}












































