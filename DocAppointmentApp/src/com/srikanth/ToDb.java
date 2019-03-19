package com.srikanth;

import java.sql.*;

public class ToDb{
	String id;
	String name;
	String age;
	String gender;
	String mno;
	String mid;
	String uname;
	String pid;
	
	public ToDb(String id , String name , String age , String gender , String mno , String mid , String uname ,String pid ) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mno = mno;
		this.mid = mid;
		this.uname = uname;
		this.pid = pid;
	}
	
	PatJBean pat = new PatJBean();
		public void StoretoDb() throws SQLException
		{
			

			Connection con = ConnectionManager.getConnection();
			String query = "insert into PatientDetails values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			pat.setId(id);
			ps.setString(1,pat.getId());
			pat.setName(name);
			ps.setString(2,pat.getName());
			pat.setAge(age);
		    ps.setString(3, pat.getAge());
		    pat.setGender(gender);
		    ps.setString(4, pat.getGender());
		    pat.setMobileno(mno);
		    ps.setString(5, pat.getMobileno());
		    pat.setMailid(mid);
		    ps.setString(6, pat.getMailid());
		    pat.setUname(uname);
		    ps.setString(7, pat.getUname());
		    pat.setPid(pid);
		    ps.setString(8, pat.getPid());
		    
		    
		    int temp = ps.executeUpdate();
		    System.out.println(temp+" row affected");
		    
		    
		}
		

}