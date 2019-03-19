package org.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.rest.Service.EmployeeService;
import org.rest.Service.impl.EmployeeServiceImplimentation;
import org.rest.model.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	//@Autowired
	
	@Autowired
	JdbcTemplate jdbc;
	
	
	@RequestMapping(value = "/addEmployee" , method = RequestMethod.POST)
	public EmployeeDetails addEmployee(@RequestParam("id") int id , @RequestParam("empName") String empName , @RequestParam("dept") String dept , @RequestParam("salary") int salary , @RequestParam("empMgrName") String empMgrName , @RequestParam("empDeptId") int empDeptId)
	{
		//System.out.println("jdbc object  = "+jdbc);
		//	System.out.println("Hello");
		
		//		jdbc.update(sql, emp.getId(),emp.getEmpName(),emp.getDept(),emp.getSalary(),emp.getEmpMgrName(),emp.getEmpDeptId());
		EmployeeService empservice = new EmployeeServiceImplimentation();
		EmployeeDetails emp = new EmployeeDetails();
		emp.setId(id);
		emp.setEmpName(empName);
		emp.setDept(dept);
		emp.setSalary(salary);
		emp.setEmpMgrName(empMgrName);
		emp.setEmpDeptId(empDeptId);
		
		//System.out.println("hi hello");
	//	return emp;
		
		empservice.addEmployee(emp,jdbc);
		
		return emp;
		
	}
	
	
	@RequestMapping(value = "/deleteEmployee" , method = RequestMethod.POST)
	public String deleteEmployee(@RequestParam("id") int id )
	{
		EmployeeService empservice = new EmployeeServiceImplimentation();
		
		empservice.deleteEmployee(id,jdbc);
		
		return "deleted";
		
	}
	
	@RequestMapping(value = "/getEmployeeById" , method = RequestMethod.POST)
	public EmployeeDetails getElementById(@RequestParam("id") int id)
	{
		
		EmployeeService empservice = new EmployeeServiceImplimentation();
		
		//List<EmployeeDetails> emp = new ArrayList();
		EmployeeDetails emp = new EmployeeDetails();
		emp = empservice.getEmployeeById(id,jdbc);
		
		return emp;
		
	}
	
	

}
