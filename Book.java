package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	@Id
	private int bookId;
	private String bookName;
	private int price;
	@ManyToMany(cascade=CascadeType.ALL)
	private  List<Auther> auther;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<Auther> getAuther() {
		return auther;
	}
	public void setAuther(List<Auther> auther) {
		this.auther = auther;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", auther=" + auther + "]";
	}
	public Book(int bookId, String bookName, int price, List<Auther> auther) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.auther = auther;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
