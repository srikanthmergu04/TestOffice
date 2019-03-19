package com.srikanth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdatePatientDbTable {
	
	String name;
	String id ;
   	String age;
	String gender;
	String mobileno;
	String mailid;
	String uname;
	String pid;
	String key;
	public UpdatePatientDbTable(String name, String id, String age, String gender, String mobileno, String mailid,
			String uname, String pid, String key) 
	{
		//super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.mobileno = mobileno;
		this.mailid = mailid;
		this.uname = uname;
		this.pid = pid;
		this.key = key;
	}
	
	public void UpdateToDb() throws Exception
	{
		Connection con = ConnectionManager.getConnection();
		String query = "update PatientDetails SET id = ? , pname = ? , pAge = ? , pgen = ?, pmno = ? , pmid = ? , pusername = ? , ppid = ? WHERE Id = ?";
		PreparedStatement ps = con.prepareStatement(query);
	//	System.out.println(id);
		
		ps.setString(1, id);
		ps.setString(2, name);
		ps.setString(3, age);
		ps.setString(4, gender);
		ps.setString(5, mobileno);
		ps.setString(6, mailid);
		ps.setString(7, uname);
		ps.setString(8, pid);
		ps.setString(9, key);
		
		int count  = ps.executeUpdate();
		System.out.println(count+" row affected");
	}
}
