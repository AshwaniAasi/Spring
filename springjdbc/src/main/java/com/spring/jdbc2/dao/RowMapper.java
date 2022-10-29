package com.spring.jdbc2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.spring.jdbc2.entity.Entity;

public class RowMapper implements org.springframework.jdbc.core.RowMapper<Entity>
{

	public Entity mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Entity entity=new Entity();
		entity.setName(rs.getString(1));
		entity.setEmail(rs.getString(2));
		entity.setGender(rs.getString(3));
		entity.setCity(rs.getString(4));
		return entity;
	}
	
}
