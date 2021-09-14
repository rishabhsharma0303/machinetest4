package com.app_jdbc.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class TableChapterKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String isbn;
	private Integer chapterNumber;
	public TableChapterKey() {
	
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(Integer chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chapterNumber == null) ? 0 : chapterNumber.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TableChapterKey other = (TableChapterKey) obj;
		if (chapterNumber == null) {
			if (other.chapterNumber != null)
				return false;
		} else if (!chapterNumber.equals(other.chapterNumber))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
}
