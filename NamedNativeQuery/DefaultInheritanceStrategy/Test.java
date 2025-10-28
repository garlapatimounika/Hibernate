package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.entity.Person;

public class Test {
	public static void main(String[] args) {
		
	
	Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
    SessionFactory sessionFactory=configuration.buildSessionFactory();
    Session session=sessionFactory.openSession();
    Transaction transaction=session.beginTransaction();
    Person person=new Person();
    person.setName("mou");
    person.setGender("female");
    
    Employee employee=new Employee();
    employee.setDepartment("Sales");
    employee.setSalary(35000);
    
    Employee employee1=new Employee();
    employee1.setDepartment("IT");
    employee1.setSalary(45000);
    session.save(person);
    session.save(employee);
    session.save(employee1);
    transaction.commit();
    System.out.println("Data inserted successfully");
    
}
}
