

package com.code.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	static Connection conn=null;

	public static Connection getMyConnection() {

		if(conn==null) {
			String url = "jdbc:mysql://localhost:3306/work?autoReconnect=true&useSSL=false";
            // no server SecureSocketLayer=false, connectionTimeout -> AutoReconnect=true
            String user = "root";
            String password = "Tribhuvan@123";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);
                
			if (conn != null) {
		           System.out.println("Connected to database ");
		    }
			} catch (Exception e) {
				System.out.println("Connection not done derby ");
				//e.printStackTrace();
			}
			
		}
		return conn;
	}
	
	public static void closeMyConnection() {

		try {
			conn.close();
		} catch (SQLException e) {
			
			//e.printStackTrace();
		}
		
	}

}
