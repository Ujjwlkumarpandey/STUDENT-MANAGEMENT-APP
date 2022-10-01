package com.student.mange;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	 static Connection con;
	
	public static Connection createC() {
		//load
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			///create connection
			String user="root";
			String password="2002";
			String url="jdbc:mysql://localhost:3307/student_manage";
			
				con=DriverManager.getConnection(url, user, password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return con;
	
	}

}
