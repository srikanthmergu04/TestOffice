package com.srikanth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class getPatDetailsFromDb {
	String str;
	public getPatDetailsFromDb(String str)
	{
		this.str = str;
		
		//System.out.println(str);
	}
	
	


	public ArrayList getDetails() throws Exception
	{
		Connection con = ConnectionManager.getConnection();
		String query = "SELECT *FROM PatientDetails WHERE id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, str);
		//System.out.println("how are you");
		ResultSet rs = ps.executeQuery();
        rs.next();
        
		ArrayList ls = new ArrayList();
		
	    ls.add(rs.getString("Id"));
	    ls.add(rs.getString("pname"));
	    ls.add(rs.getString("pAge"));
	    ls.add(rs.getString("pgen"));
	    ls.add(rs.getString("pmno"));
	    ls.add(rs.getString("pmid"));
	    ls.add(rs.getString("pusername"));
	    ls.add(rs.getString("ppid"));
	  
	    for(int i=0;i<8;i++)
	    {
	    	System.out.println(ls.get(i));
	    }
	    
	    
	   
	    return ls;
		
	}

}
