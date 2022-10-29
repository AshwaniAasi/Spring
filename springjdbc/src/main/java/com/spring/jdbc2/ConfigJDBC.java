package com.spring.jdbc2;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc2.dao.DaoImpl;

@Configuration
@ComponentScan( basePackages =  {"com.spring.jdbc2.dao"} )
public class ConfigJDBC 
{
	@Bean("dmds")
	public DataSource getdriverMDS()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://Localhost:3306/sp_demo");
		dmds.setUsername("root");
		dmds.setPassword("12345");
		return dmds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJDBCTemplate()
	{
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(getdriverMDS());		
		return jdbcTemplate;
	}
	
	@Bean("daoImpl")
	public DaoImpl getDaoImpl()
	{
		DaoImpl daoImpl = new DaoImpl();
		daoImpl.setJdbcTemplate(getJDBCTemplate());
		return daoImpl;
	}
}
