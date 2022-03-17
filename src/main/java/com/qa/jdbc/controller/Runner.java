package com.qa.jdbc.controller;

import com.qa.jdbc.TestConnection;
import com.qa.jdbc.daos.PersonDAO;

public class Runner {
	
	public static void main(String[] args) {
		
	
	
//	this is a method that needs to be run to test connection
		TestConnection tc = new TestConnection();
		tc.testConnection();
//	
	PersonDAO pDAO = new PersonDAO();
	PersonController pController = new PersonController(pDAO);
	
//	pController.create();
//	pController.readAll();
//	pController.readByID();
//	pController.update();
	pController.delete();
	
	
	}
}
