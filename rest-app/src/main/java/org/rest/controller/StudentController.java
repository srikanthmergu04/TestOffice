package org.rest.controller;


import java.util.ArrayList;
import java.util.List;

import org.rest.dao.StudentDao;
import org.rest.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentDao sd;
	
	@RequestMapping(value = "/student",method = RequestMethod.GET)
	public List<Student> getAllStudents()
	{
		List<Student> list = new ArrayList();
		
		list  = sd.getStudents();
		return list;
		
		
	}
	
	@RequestMapping(value = "/branches",method = RequestMethod.GET)
	public List getBranches()
	{
		List ls = new ArrayList();
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1 = sd.getStudents().get(0);
		s2 = sd.getStudents().get(1);
		
		ls.add(s1.getDept());
		ls.add(s2.getDept());
		
		return ls;
		
	 
		
	}
	
	@RequestMapping(value = "/addStudent",method = RequestMethod.POST)
	public Student addStudent(@RequestParam("id") int id  , @RequestParam("fn") String fn , @RequestParam("ln") String ln , @RequestParam("dept") String dept )
	{
		Student st = new Student();
		
		st.setId(id);
		st.setFirstname(fn);
		st.setLastname(ln);
		st.setDept(dept);
		
		return st;
		
	}
	
	

}
