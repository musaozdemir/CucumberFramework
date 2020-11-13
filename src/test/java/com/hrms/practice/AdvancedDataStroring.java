package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AdvancedDataStroring {

	
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:msql://hostname:port/db name
	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	
//	@Test
	public void advancedStuff() throws SQLException {
		

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id, name, country_code from ohrm_location");
		
		List<Map<String , String>> listData = new ArrayList<>();
		Map<String , String> mapData;
		
		while(rs.next()) {
			mapData = new LinkedHashMap<>();
			mapData.put("ID", rs.getObject("id").toString());
			mapData.put("name", rs.getObject("name").toString());
			mapData.put("country_code", rs.getObject("country_code").toString());
//			System.out.println(mapData);
			listData.add(mapData);
			
		}
		System.out.println(listData);
		
		rs.close();
		st.close();
		conn.close();
		
	}
	
	//@Test
	public void anotherTest() throws SQLException {
		

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from ohrm_job_title");
		ResultSetMetaData rsMetaDeta = rs.getMetaData();
		List<Map<String , String>> listData = new ArrayList<>();
		Map<String , String> mapData;
		
		while(rs.next()) {
			mapData = new LinkedHashMap<>();
			for(int i=1; i<= rsMetaDeta.getColumnCount(); i++) {
				
				String colname= rsMetaDeta.getColumnName(i);
				String value = rs.getObject(i).toString();
				mapData.put(colname, value);
				
			}
			listData.add(mapData);
			
		}
		
		System.out.println(listData);
		rs.close();
		st.close();
		conn.close();
	}
	
	//@Test
	public void Task() throws SQLException {
		

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id, name from ohrm_nationality");
		
		List<Map<String , String>> listData = new ArrayList<>();
		Map<String , String> mapData;
		
		while(rs.next()) {
			mapData = new LinkedHashMap<>();
			mapData.put("ID", rs.getObject("id").toString());
			mapData.put("name", rs.getObject("name").toString());
			listData.add(mapData);
			
		}
		System.out.println(listData);
		
		rs.close();
		st.close();
		conn.close();
	}
	
	@Test
	public void Task2() throws SQLException {
		

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id, name from ohrm_nationality");
		ResultSetMetaData rsMetaDeta = rs.getMetaData();
		List<Map<String , String>> listData = new ArrayList<>();
		Map<String , String> mapData;
		
		while(rs.next()) {
			mapData = new LinkedHashMap<>();
			for(int i=1; i<= rsMetaDeta.getColumnCount(); i++) {
				
				String colname= rsMetaDeta.getColumnName(i);
				String value = rs.getObject(i).toString();
				mapData.put(colname, value);
				
			}
			listData.add(mapData);
			
		}
		
		System.out.println(listData);
		rs.close();
		st.close();
		conn.close();
	}
	
}
