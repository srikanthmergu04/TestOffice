package com.srikanth;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DocDetails {
	
ArrayList rows  = new ArrayList();
	
	public ArrayList getPatDetails() throws SQLException
	{
		//System.out.println("patDetails.java");
		Connection con = ConnectionManager.getConnection();
		String query1 = "SELECT *FROM DocDetails";
		String query2 = "SELECT *FROM DocDetails";
		
		Statement st1 = con.createStatement();
		Statement st2 = con.createStatement();
		
		
		
		ResultSet rs1 = st1.executeQuery(query1);
		ResultSetMetaData rsmd = rs1.getMetaData();
		
		
	//	System.out.println("patDetails.java1");
		
		int count=0;
		
		count = rsmd.getColumnCount();
		//System.out.println(count);
		
		
		//System.out.println("patDetails.java2");
		//System.out.println("hello patdetails");
		
		
	
		ResultSet rs2 = st2.executeQuery(query2);
		
		while(rs2.next())
		{
			ArrayList row = new ArrayList();
			for(int i=0;i<count;i++)
			{
				row.add(rs2.getString(i+1)+" 	");
			}
			
			rows.add(row);
			//System.out.println("hello patdetails");
			
		}
		
		
		return rows;
		
	}
	

}
