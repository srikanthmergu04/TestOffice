package org.rest.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rest.model.EmployeeDetails;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapperDisplay implements RowMapper<EmployeeDetails> {

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
