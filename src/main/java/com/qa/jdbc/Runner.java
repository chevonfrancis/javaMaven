package com.qa.jdbc;

import java.util.List;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class Runner {
	
	public static void main(String[] args) {
		
//		this is a method that needs to be run to test connection
//		TestConnection tc = new TestConnection();
//		tc.testConnection();
//		
//		CRUD Functionality (CREATE, READ, UPDATE, DELETE)
//		DAO - data access object 
//		controllers - layer that interacts with users 
		
//		create person
		PersonDAO pDAO = new PersonDAO();
		
//		Person p = new Person("Sarah", "Morgan", 24);
//		Person pTwo = new Person("Lauren", "Thomas", 29);
//		
//		pDAO.create(p);
//		pDAO.create(pTwo);
////		
//		System.out.println(pDAO.readByID(2));
//		
//		read all
		List<Person> people = pDAO.readAll();
		for (Person person : people) {
			System.out.println(person);
		}
//		
//		
////		Update
//		Person update = new Person(2, "Roberto", "Riddles", 45);
//		pDAO.update(update);
//		
//		Deleted
//		pDAO.delete(10);
		
	}

}
