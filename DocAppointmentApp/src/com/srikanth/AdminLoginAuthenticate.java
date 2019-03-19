package com.srikanth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

public class AdminLoginAuthenticate {
	
	String uname;
	String pid;
	
	public AdminLoginAuthenticate(String uname , String pid)
	{
		this.uname = uname;
		this.pid = pid;
	}
	
	public boolean AuthenticateUser() throws Exception
	{
		Connection con = ConnectionManager.getConnection();
		String query = "select pid from admin where username = ?";
		PreparedStatement ps = con.prepareStatement(query);
	//	System.out.println(uname);
		ps.setString(1, uname);
		ResultSet rs = ps.executeQuery();
		rs.next();
		String password = rs.getString("pid");
		//System.out.println(password);
		if(pid.equals(password))
			return true;
		else
			return false;
		
		
		
		
	}

}
