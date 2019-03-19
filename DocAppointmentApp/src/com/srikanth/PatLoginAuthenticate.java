package com.srikanth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

public class PatLoginAuthenticate {
	
	String uname;
	String pid;
	
	public PatLoginAuthenticate(String uname , String pid)
	{
		this.uname = uname;
		this.pid = pid;
	}
	
	public boolean AuthenticateUser() throws Exception
	{
		Connection con = ConnectionManager.getConnection();
		String query = "select ppid from PatientDetails where pusername = ?";
		PreparedStatement ps = con.prepareStatement(query);
		System.out.println(uname);
		ps.setString(1, uname);
		ResultSet rs = ps.executeQuery();
		rs.next();
		String password = rs.getString("ppid");
		System.out.println(password);
		if(pid.equals(password))
			return true;
		else
			return false;
		
		
		
		
	}

}
