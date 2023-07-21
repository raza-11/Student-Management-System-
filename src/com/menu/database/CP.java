package com.menu.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {

	static Connection con;

	public static Connection createc() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// craete connection

			String user = "root";
		 	String password = "root";
		    String url = "jdbc:mysql://localhost:3306/StudentManegement";
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
