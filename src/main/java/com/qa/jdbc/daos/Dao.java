package com.qa.jdbc.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// this interface will be of a generic type 
// T gets replace by whatever type is being implemented 
public interface Dao<T> {
	
	 void create(T t);
	
	T readAll(int id);
	
	List<T> readByID();
	
	 void update(T t);
	
	int delete(int id);
	
	T modelFromResultSet(ResultSet resultSet) throws SQLException; 
	

}
