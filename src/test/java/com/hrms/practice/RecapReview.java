package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.hrms.utils.ConfigsReader;

public class RecapReview {

	/**
	 *  Add mysql connedtor to dependencies (jdbc)
	 *  Steps for automate database testing 
	 *  1. connect to database
	 *  2.create a statement
	 *  3. execute query
	 *  4. process result (validations)
	 *  5. close connections
	 *  
	 *  Create connection with our database
	 *  dbUrl, dbusername, dbpassword
	 *  
	 *  hostname (ipaddress)
	 *  dbType
	 *  portnumber
	 *  dbBasenumber
	 *  
	 *  jdbc:jdbcType//ipaddress:portnumber/dbname
	 *  dbUrl = jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql
	 *  config utility file to read dbconfigitartion.properties file
	 */
	
//	Connection connection = DriverManager.getConnection(ConfigsReader.getPropValue("dbUrl"), ConfigsReader.getPropValue("dbUsername"), ConfigsReader.getPropValue("dbPassword)"));
//	
//	Statement st = connection.createStatement(); 
//	
	
	
	}
