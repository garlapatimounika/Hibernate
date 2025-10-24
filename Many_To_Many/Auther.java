package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Auther {
	private int autherId;
	private String  autherName;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Book>book;
	public int getAutherId() {
		return autherId;
	}
	public void setAutherId(int autherId) {
		this.autherId = autherId;
	}
	public String getAutherName() {
		return autherName;
	}
	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Auther [autherId=" + autherId + ", autherName=" + autherName + ", book=" + book + "]";
	}
	public Auther(int autherId, String autherName, List<Book> book) {
		super();
		this.autherId = autherId;
		this.autherName = autherName;
		this.book = book;
	}
	public Auther() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
