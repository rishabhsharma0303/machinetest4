package com.app_jdbc.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE_PUBLISHER")
public class Publisher {	
	@Id
	@Column(name = "CODE",nullable = false,length = 4)
	private String code;
	
	@Column(name = "PUBLISHER_NAME ",nullable = false,length = 100)
	private String name;

	@OneToMany(mappedBy = "publisher")
	private List<Book> books;
	
	public Publisher() {}	
	public Publisher(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Publisher [code=" + code + ", name=" 
				+ name + "]";
	}	
}














