package org.rest.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.rest.Service.EmployeeService;
import org.rest.dao.EmployeeDao;
import org.rest.dao.impl.EmployeeDaoImplimentation;
import org.rest.model.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplimentation implements EmployeeService {

	
	//System.out.println("addEmployee ServiceImplimentation");
	
	
	@Override
	public List<EmployeeDetails> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployee(EmployeeDetails emp , JdbcTemplate jdbc) {
		// TODO Auto-generated method stub
		System.out.println("addEmployee Service");
		EmployeeDao employeedao = new EmployeeDaoImplimentation();
		employeedao.addEmployee(emp,jdbc);
		//return update;
		
	}

	@Override
	public void updateEmployee(EmployeeDetails emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id , JdbcTemplate jdbc) {
		// TODO Auto-generated method stub
		EmployeeDao employeedao = new EmployeeDaoImplimentation();
		employeedao.deleteEmployee(id, jdbc);
		
		
		
	}

	@Override
	public EmployeeDetails getEmployeeById(int id , JdbcTemplate jdbc) {
		// TODO Auto-generated method stub
		
	//	List<EmployeeDetails> list = new ArrayList();
		EmployeeDetails emp = new EmployeeDetails();
		EmployeeDao employeedao = new EmployeeDaoImplimentation();
		
		emp = employeedao.getEmployeeById(id, jdbc);
		return emp;
	}

}
