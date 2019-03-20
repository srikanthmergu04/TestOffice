package org.rest.dao;

import java.util.List;

import org.rest.model.EmployeeDetails;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao {
	
	public List<EmployeeDetails> listAllUsers(JdbcTemplate jdbc);
	
//	public int addEmployee(EmployeeDetails emp);
	
	public void addEmployee(EmployeeDetails emp, JdbcTemplate jdbc);
	
	public EmployeeDetails updateEmployee(int id , EmployeeDetails emp , JdbcTemplate jdbc);
	
	//public void deleteEmployee(int id);
	
	public void deleteEmployee(int id, JdbcTemplate jdbc);
	
	public EmployeeDetails getEmployeeById(int id , JdbcTemplate jdbc);
	
	public List<EmployeeDetails> getEmployeeByDept(String Dept , JdbcTemplate jdbc);
	

}
