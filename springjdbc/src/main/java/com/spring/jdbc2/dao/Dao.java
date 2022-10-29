package com.spring.jdbc2.dao;

import java.util.List;

import com.spring.jdbc2.entity.Entity;

public interface Dao 
{
	public int insert(Entity entity);

	public int update(Entity entity);
	
	public int delete(Entity entity);
	
	public Entity select(Entity entity);

	public List<Entity> allDB(Entity entity);
	
}
