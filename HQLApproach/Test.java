package com.client;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Student;

public class Test {
	public static void main(String[] args) {
		Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		//-----------------------------------
		//String hql="from Student";
		
		//Query<Student> query = session.createQuery(hql);

	//List<Student> listOfStudent=query.getResultList();
	//listOfStudent.forEach(System.out::println);
	//List<Student> listOfStudent=query.list();
	//listOfStudent.forEach(System.out::println);
		//-------------------------------------
		//get single data
		
		//String hql="from Student where id=102";
		//Query<Student> query = session.createQuery(hql);
		//Student student=query.getSingleResult();
		//System.out.println(student);
		//--------------------------
		
		//String hql="update Student set name=moni where id=101";
		//Query<Student> query = session.createQuery(hql);
		//query.executeUpdate();
		//transaction.commit();
		
		//-----------------------------------------
		
		//delete
		String hql="delete from Student where id=102";
		Query<Student> query = session.createQuery(hql);
		query.executeUpdate();
		transaction.commit();
		
		
		
	
		session.close();
		
	}

}
