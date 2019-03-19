package org.rest.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rest.model.EmployeeDetails;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<EmployeeDetails> {

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeDetails emp = new EmployeeDetails();
		
		emp.setId(rs.getInt("id"));
		emp.setEmpName(rs.getString("empName"));
		emp.setDept(rs.getString("dept"));
		emp.setSalary(rs.getInt("salary"));
		emp.setEmpMgrName(rs.getString("empMgrName"));
		emp.setEmpDeptId(rs.getInt("empDeptId"));
		
		
		
		
		return emp;
	}

}
