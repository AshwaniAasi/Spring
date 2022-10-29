package com.spring.jdbc2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc2.entity.Entity;

@Component("daoImpl")
public class DaoImpl implements Dao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {	return jdbcTemplate;	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {	this.jdbcTemplate = jdbcTemplate;	}

	// inserting query
	public int insert(Entity entity) 
	{
	    String query="insert into register(name, email, gender, city) value(?, ?, ?, ?)";
	    int result = this.jdbcTemplate.update(query, entity.getName(), entity.getEmail(), entity.getGender(), entity.getCity());
		return result;
	}
	
	// updating query
	public int update(Entity entity)
	{
		String query="update register set email=?, city=?, gender=? where name=?";
		int result = this.jdbcTemplate.update(query, entity.getEmail(), entity.getCity(), entity.getGender(), entity.getName());
		return result;
	}
	
	// delete query
	public int delete(Entity entity)
	{
		String query="delete from register where name=?";
		int result = this.jdbcTemplate.update(query, entity.getName());
		return result;
	}
	
	// single Select
	public Entity select(Entity entity) {
		String query="select * from register where name=?";
		RowMapper rowMapper= new RowMapper();
		Entity entity2 = this.jdbcTemplate.queryForObject(query,rowMapper ,entity.getName());
		return entity2;
	}
	
	// DB entry
	public List<Entity> allDB(Entity entity) {
		String query="select * from register";
		List<Entity> query2 = this.jdbcTemplate.query(query, new RowMapper());
		return query2;
	}
	
	
}
