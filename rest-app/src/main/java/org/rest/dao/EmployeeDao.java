package org.rest.dao;

import java.util.List;

import org.rest.model.EmployeeDetails;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao {
	
	public List<EmployeeDetails> listAllUsers();
	
//	public int addEmployee(EmployeeDetails emp);
	
	public void addEmployee(EmployeeDetails emp, JdbcTemplate jdbc);
	
	public void updateEmployee(EmployeeDetails emp);
	
	//public void deleteEmployee(int id);
	
	public void deleteEmployee(int id, JdbcTemplate jdbc);
	
	public List<EmployeeDetails> getEmployeeById(int id , JdbcTemplate jdbc);
	

}
