package com.jdbc1;
import java.sql.*;
import java.util.*;
public class display {
	public static void main(String[] args) throws Exception {
		String display="select * from employee";
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery(display);
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
			}
			rs.close();
			c.close();
		
	}
}
