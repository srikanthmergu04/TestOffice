package org.rest.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.rest.dao.EmployeeDao;
import org.rest.model.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImplimentation implements EmployeeDao {
	
/*	
	@Autowired
	JdbcTemplate jdbc;
*/

	public EmployeeDaoImplimentation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<EmployeeDetails> listAllUsers(JdbcTemplate jdbc) {
		// TODO Auto-generated method stub
		
		//List<EmployeeDetails> emp = new ArrayList();
		
		String sql = "SELECT *FROM EmployeeDetails";	
		
		
		return jdbc.query(sql, new EmployeeRowMapper());
	}

	@Override
	public void addEmployee(EmployeeDetails emp , JdbcTemplate jdbc) {
		// TODO Auto-generated method stub
		
		
		String sql = "INSERT INTO EmployeeDetails (id,empName,dept,salary,empMgrName,empDeptId)VALUES (?,?,?,?,?,?)";
		System.out.println("Hello World before"+jdbc);
		System.out.println(emp.getDept());
		
		jdbc.update(sql, emp.getId() ,emp.getEmpName(),emp.getDept(),emp.getSalary(),emp.getEmpMgrName(),emp.getEmpDeptId());

	//	jdbcTemplate.update
		System.out.println("Hello World after");
		/*if(update == 1)
		{
			System.out.println("Employee Created");
		}*/
		
      //  return 1;
	}

	@Override
	public EmployeeDetails updateEmployee(int id , EmployeeDetails emp , JdbcTemplate jdbc) {
		
		String sql = "UPDATE EmployeeDetails SET empName = ? , dept = ? , salary = ? , empMgrName = ? , empDeptId = ? WHERE id = ?";
		
		jdbc.update(sql , emp.getEmpName() , emp.getDept() , emp.getSalary() , emp.getEmpMgrName() , emp.getEmpDeptId() , id);
		
		
		return emp;
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int id , JdbcTemplate jdbc) {
		// TODO Auto-generated method stub
		
		String sql = "DELETE FROM EmployeeDetails WHERE id = ?";
		
		jdbc.update(sql, id);
		
		

	}

	@Override
	public EmployeeDetails getEmployeeById(int id , JdbcTemplate jdbc) {
		
		//List<EmployeeDetails> list = new ArrayList();
		
		EmployeeDetails emp = new EmployeeDetails();
		
		String sql = "SELECT *FROM EmployeeDetails WHERE id = ?";
		
		emp = jdbc.queryForObject(sql, new EmployeeRowMapper(), id);
		
		//list.add(emp);
		// TODO Auto-generated method stub
		return emp;
	}

	@Override
	public List<EmployeeDetails> getEmployeeByDept(String Dept, JdbcTemplate jdbc) {
		// TODO Auto-generated method stub
	
		String sql = "SELECT *FROM EmployeeDetails WHERE dept = ?";
				
		return jdbc.query(sql, new EmployeeRowMapper() , Dept);
		
	}

}
