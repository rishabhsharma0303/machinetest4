package com.app_jdbc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE CHAPTER")
public class Chapter {
	@Id
	private TableChapterKey chapterKey;
	private String title;
	private Integer chapterNumber;
	
	@ManyToOne
	@JoinColumn(name = "book_fk")
	private Book book;
	
	public Chapter() {}	
	public Chapter(String title, Integer chapterNumber) {
		this.title = title;
		this.chapterNumber = chapterNumber;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getChapterNumber() {
		return chapterNumber;
	}
	public void setChapterNumber(Integer chapterNumber) {
		this.chapterNumber = chapterNumber;
	}
	
	@Override
	public String toString() {
		return "Chapter [title=" + title + ", chapterNumber=" 
				+ chapterNumber + "]";
	}	
}














