package com.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Auther;
import com.entity.Book;

public class Test {
	public static void main(String[] args) {
		Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		//-----------------------------------
		Auther auther1=new Auther();
		auther1.setAutherId(101);
		auther1.setAutherName("Ms.Mounika");
		//----------------------------------
		Auther auther2=new Auther();
		auther2.setAutherId(103);
		auther2.setAutherName("Ms.Harika");
		//----------------------------
		Auther auther3=new Auther();
		auther3.setAutherId(103);
		auther3.setAutherName("Ms.Radhika");
		
		Book book1=new Book();
		book1.setBookId(201);
		book1.setBookName("java");
		book1.setPrice(2000);
		//------------------
		Book book2=new Book();
		book2.setBookId(202);
		book2.setBookName("Python");
		book2.setPrice(2500);
		
		//-----------------
		Book book3=new Book();
		book3.setBookId(203);
		book3.setBookName("c++");
		book3.setPrice(1000);
		
		List<Auther> listOfAuther=new ArrayList();
		listOfAuther.add(auther1);
		listOfAuther.add(auther2);
		listOfAuther.add(auther3);
		
		List<Book> listOfBook=new ArrayList();
		listOfBook.add(book1);
		listOfBook.add(book2);
		listOfBook.add(book3);
		
		auther1.setBook(listOfBook);
		auther2.setBook(listOfBook);
		auther3.setBook(listOfBook);
		
		book1.setAuther(listOfAuther);
		book2.setAuther(listOfAuther);
		book3.setAuther(listOfAuther);
		//-------------------------------
		session.save(auther1);
		transaction.commit();
		System.out.println("Operation success!!!");
	
		
		
		
	}

}
