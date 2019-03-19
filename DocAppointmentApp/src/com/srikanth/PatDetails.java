package com.srikanth;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.*;
import java.sql.Statement;

public class PatDetails {


	
	ArrayList rows  = new ArrayList();
	
	public ArrayList getPatDetails() throws SQLException
	{
		//System.out.println("patDetails.java");
		Connection con = ConnectionManager.getConnection();
		String query1 = "SELECT *FROM PatientDetails";
		String query2 = "SELECT *FROM PatientDetails order by Id asc";
		
		Statement st1 = con.createStatement();
		Statement st2 = con.createStatement();
		
		
		
		ResultSet rs1 = st1.executeQuery(query1);
		ResultSetMetaData rsmd = rs1.getMetaData();
		
		
	//	System.out.println("patDetails.java1");
		
		int count=0;
		
		count = rsmd.getColumnCount();
		System.out.println(count);
		
		
		//System.out.println("patDetails.java2");
		//System.out.println("hello patdetails");
		
		
	
		ResultSet rs2 = st2.executeQuery(query2);
		
		while(rs2.next())
		{
			ArrayList row = new ArrayList();
			for(int i=0;i<count;i++)
			{
				row.add(rs2.getString(i+1));
			}
			
			rows.add(row);
			//System.out.println("hello patdetails");
			
		}

	
		
		return rows;
		
	}
	
	
	
	
}
