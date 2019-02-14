package com.suraj.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws Exception{

		Class.forName("oracle.jdbc.OracleDriver");

		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g");
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select deptno,dname,loc from dept");
		while(rs.next()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		rs.close();
		st.close();
		con.close();
	}
}
