package org.rest.Service;

import java.util.List;

import org.rest.model.EmployeeDetails;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public interface EmployeeService {
	
public List<EmployeeDetails> listAllUsers(JdbcTemplate jdbc);
	
	//public int addEmployee(EmployeeDetails emp);
	
	public EmployeeDetails updateEmployee(int id , EmployeeDetails emp , JdbcTemplate jdbc);
	
//	public void deleteEmployee(int id);
	
	public EmployeeDetails getEmployeeById(int id , JdbcTemplate jdbc);

	public void addEmployee(EmployeeDetails emp, JdbcTemplate jdbc);

//	public void deleteEmployee(int id, JdbcTemplate jdbc);

	public void deleteEmployee(int id, JdbcTemplate jdbc);
	
	public List<EmployeeDetails> getEmployeeByDept(String Dept , JdbcTemplate jdbc);

}
