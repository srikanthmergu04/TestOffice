package com.srikanth;

import java.sql.*;

public class DocToDb{
    String id;
	String name;
	String age;
	String gender;
	String mno;
	String spc;
	String uname;
	String pid;
	
	public DocToDb(String id,String name , String age , String gender , String mno ,String spc , String uname ,String pid ) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mno = mno;
		this.spc = spc;
		this.uname = uname;
		this.pid = pid;
	}
	
	DocJBean doc = new DocJBean();
	
		public void StoretoDb() throws SQLException
		{
			

			Connection con = ConnectionManager.getConnection();
			String query = "insert into docDetails values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
		
			doc.setId(id);
			ps.setString(1, doc.getId());
			doc.setName(name);
			ps.setString(2, doc.getName());
			doc.setAge(age);
			ps.setString(3, doc.getAge());
			doc.setGender(gender);
			ps.setString(4, doc.getGender());
			doc.setMobileno(mno);
			ps.setString(5, doc.getMobileno());
			doc.setSpc(spc);
			ps.setString(6, doc.getSpc());
			doc.setUname(uname);
			ps.setString(7, doc.getUname());
			doc.setPid(pid);
			ps.setString(8, doc.getPid());
		    
		    
		    int temp = ps.executeUpdate();
		    System.out.println(temp+" row affected");
		    
		    
		}
		

}