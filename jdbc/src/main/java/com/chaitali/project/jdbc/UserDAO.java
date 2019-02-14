package com.chaitali.project.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO {

	
	private JdbcTemplate  jdbcTemplate;

	/**
	 * @return the jdbcTemplate
	 *//*
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}*/

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveUser(User u){  
	    String query="insert into user values("+u.getUsername()+","+u.getLastname()+")";  
	    return jdbcTemplate.update(query);  
	}  
	
	
	
	public int updateEmployee(User e){  
	    String query="update employee set name='"+e.getUsername()+"',salary='"+e.getLastname()+"' where id='"+e.getRollno()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(User e){  
	    String query="delete from employee where id='"+e.getRollno()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
}
