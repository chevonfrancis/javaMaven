package com.qa.jdbc.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.qa.jdbc.domain.Person;

public class CustomerDAO  implements Dao<Person> {

	@Override
	public void create(Person t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person readAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> readByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Person t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Person modelFromResultSet(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
