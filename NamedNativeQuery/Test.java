
package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.entity.Student;

public class Test {
	public static void main(String[] args) {
		
	
	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cfg.xml");
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	Session session=sessionFactory.openSession();
    NativeQuery nativeQuery=	session.getNamedNativeQuery("getAllData");
	  List<Student> listOfStudents=nativeQuery.list();
	  listOfStudents.forEach(System.out::println);

}
}