package com.qa.jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class PersonController {
	
	private Scanner scanner = new Scanner(System.in);
	private PersonDAO personDAO;
	
	
	public PersonController(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	public void create() {
		System.out.println("Enter first name here: ");
		String firstName = scanner.nextLine();
		
		System.out.println("Enter last name here: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Enter age here: ");
		int age = scanner.nextInt();
		
		personDAO.create(new Person(firstName, lastName, age));
		System.out.println("Person Created");
		
	}
	
	public void readAll() {
		List<Person> people = personDAO.readAll();
		
		for (Person person : people) {
			System.out.println(person);
		}
		
	}
	public void readByID() {
		System.out.println("Enter ID here: ");
		int id = scanner.nextInt();
		Person result = personDAO.readByID(id);
		System.out.println(result);
		
	}
	
	public void update() {
		System.out.println("Enter id you would like to update ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter new first name here: ");
		String firstName = scanner.nextLine();
		
		System.out.println("Enter new last name here: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Enter new age here: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		personDAO.update(new Person(id, firstName, lastName, age));
		System.out.println("Person Update");
	}
	
	public void delete() {
		System.out.println("Enter id you would like to delete ");
		int id = scanner.nextInt();
		scanner.nextLine();
		personDAO.delete(id);
		System.out.println("They are GONE!! haha");
	}
}
