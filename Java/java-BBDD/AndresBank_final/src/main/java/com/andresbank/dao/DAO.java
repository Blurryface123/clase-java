package com.andresbank.dao;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	
	protected String driverClass = "com.mysql.jdbc.Driver";
	protected String url = "jdbc:mysql://localhost/andresbank";
	protected DataSource datasource = null;
	
	protected DAO() throws Exception {
		Class.forName(driverClass).newInstance();
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		datasource = (DataSource) envContext.lookup("jdbc/andresbank");
		
		
	}
}
