package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;

public class DBConnection {

	private static HashMap<Long, Profile> profile = new HashMap<Long, Profile>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	     ProfileInfo();
	     getProfileInfoById(123L);
    }
	
	private static Collection<Profile> ProfileInfo() {
		
		 try {
		      // MYSQL INSERT QUERY STATEMENT
	    	  Statement statement;
				statement = DBConnection().createStatement();
		   	  	ResultSet resultSet = statement.executeQuery("select * from profileinfo");
			    while(resultSet.next()){
			    	profile.put(Long.parseLong(resultSet.getString("profileId")), 
			    				new Profile(Long.parseLong(resultSet.getString("profileId")), resultSet.getString("profileName"), resultSet.getString("firstName"), resultSet.getString("lastName"), resultSet.getDate("createdDate")));
			    }
		      DBConnection().close();
		      
	      } catch (SQLException e) {
				// TODO Auto-generated catch block
	    	  e.printStackTrace();
	      }
		 
		 return profile.values();
	}
	
	private static Profile getProfileInfoById(Long profileId) {
		
		try {
		      // MYSQL INSERT QUERY STATEMENT
	    	  Statement statement;
				statement = DBConnection().createStatement();
		   	  	ResultSet resultSet = statement.executeQuery("select * from profileinfo where profileId='" + profileId + "'");
		   	  	while(resultSet.next()){
			    	profile.put(Long.parseLong(resultSet.getString("profileId")), 
			    				new Profile(Long.parseLong(resultSet.getString("profileId")), resultSet.getString("profileName"), resultSet.getString("firstName"), resultSet.getString("lastName"), resultSet.getDate("createdDate")));
			    }
		   	  	System.out.println(profile);
		      DBConnection().close();
		      
	      } catch (SQLException e) {
				// TODO Auto-generated catch block
	    	  e.printStackTrace();
	      }
	      return profile.get(profileId);
	}
	
	private static Connection DBConnection() {
			
		// Create a MYSQL DB connection
	      String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost:3306/profileInfo";
	      try {
				Class.forName(myDriver);
				Connection conn = DriverManager.getConnection(myUrl, "root", "root");
				return conn;
	      } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	      } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      		return null;
	}
}