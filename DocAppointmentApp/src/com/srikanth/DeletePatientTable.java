package com.srikanth;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeletePatientTable {
	String key;
	
	public DeletePatientTable(String key) {
		//super();
		this.key = key;
	}

	

	public void DeleteFromDb() throws Exception
	{
		//System.out.println("Hello Delete");
		Connection con = ConnectionManager.getConnection();
		String query = "DELETE FROM PatientDetails WHERE id = ?";
		PreparedStatement ps = con.prepareStatement(query);
	//	System.out.println(id);
		
        ps.setString(1, key);	
		
		int count  = ps.executeUpdate();
		System.out.println(count+" row affected");
	}
}
