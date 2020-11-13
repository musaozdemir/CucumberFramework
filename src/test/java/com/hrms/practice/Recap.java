package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Recap {
	
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:msql://hostname:port/db name
	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	
	@Test
	public void Recap() throws SQLException{
		
		
		
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from ohrm_skill");
		
		DatabaseMetaData dbMetaDeta = conn.getMetaData();
		String dbname = dbMetaDeta.getDatabaseProductName();
		System.out.println(dbname);
		
		ResultSetMetaData rsMetaData = rs.getMetaData();
		int colcount = rsMetaData.getColumnCount();
		System.out.println(colcount);
		
		for(int i=1; i<=colcount; i++) {
			String colname = rsMetaData.getColumnName(i);
			System.out.println("colum name: "+i+" "+colname);
		}
		
		
		while(rs.next()) {
			String id = rs.getObject("id").toString();
			String name= rs.getObject("name").toString();
			System.out.println(id+" = "+name);
		}
		
		rs.close();
		st.close();
		conn.close();
		
	}

}
