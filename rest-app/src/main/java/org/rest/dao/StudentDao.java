package org.rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.rest.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	public List<Student> getStudents()
	{
		
		List<Student> list = new ArrayList();
		
	    Student st= new Student();
	    Student st1 = new Student();
	    st.setId(101);
	    st.setFirstname("Vinayak");
	    st.setLastname("Deshpande");
	    st.setDept("cse");
	    
	    list.add(st);
	    
	    
	    st1.setId(102);
	    st1.setFirstname("Srikanth");
	    st1.setLastname("Mergu");
	    st1.setDept("mech");
	    
	    list.add(st1);
	    
	    
	    
		
		return list;
	}
	

}
