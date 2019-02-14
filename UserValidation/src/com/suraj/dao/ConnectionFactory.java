package com.suraj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static Connection connection;
public static Connection getConnection() throws SQLException,ClassNotFoundException{
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","orcl11g");
	return connection;
}
public static void closeConnection() throws SQLException{
	connection.close();
}
/*public static void main(String[] args) throws SQLException {
	System.out.println(ConnectionFactory.getConnection());
}*/
}
