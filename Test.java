package com.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Language;
import com.entity.Nation;

public class Test {
	public static void main(String[] args) {
		//configuration
		Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
		//SessonFactory
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		//session
		Session session=sessionFactory.openSession();
		//Transaction
		Transaction transaction=session.beginTransaction();
		//---------------------------------
		//initiatialize
		Nation nation=new Nation();
		nation.setNationId(101);
		nation.setNationName("India");
		//--------------------
		Language language1=new Language();
		language1.setLanguageId(502);
		language1.setLanguageName("Telugu");
		language1.setRegionName("Hidhu");
		language1.setNation(nation);
		
		// second language object
		Language language2=new Language();
		language2.setLanguageId(503);
		language2.setLanguageName("Hindi");
		language2.setRegionName("Hidhu");
		language2.setNation(nation);
		
		//create list of language
		List<Language> list=new ArrayList();
		list.add(language1);
		list.add(language2);
		nation.setLanguages(list);
		//-----------------------
		session.save(language2);
		transaction.commit();
		System.out.println("Data saved  !!!");
		
		
		
		
	}

}
