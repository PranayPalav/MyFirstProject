package com.jdbc1;
import java.sql.*;
import java.util.*;
public class insert {
	public static void main(String[] args) {
		String name,name1,image;
		int age,id,id1;
		String delete="delete from employee where id=?";
		String insert="insert into employee(name,age,image) values(?,?,?)";
		String data="select * from employee";
		String update="update employee set name=? where id=?";
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		name=s.nextLine();
		System.out.println("enter path");
		image=s.nextLine();
		System.out.println("enter age");
		age=s.nextInt();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
		PreparedStatement ps=con.prepareStatement(insert);
		ps.setString(1, name);
		ps.setInt(2, age);
		ps.setString(3, image);
		ps.executeUpdate();
		System.out.println("sussesfully inserted"
				+ "");
		ps.close();
		con.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		
//		try{
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
//	Statement st=con.createStatement();
//	ResultSet rs=st.executeQuery(data);
//	while(rs.next())
//		
//		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
//		con.close();	}catch(Exception e){
//		System.out.println(e);
//	}
//		System.out.println("enter id for delete the data");
//		id=s.nextInt();
//		try{
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
//			PreparedStatement psr=con.prepareStatement(delete);
//			psr.setInt(1, id);
//			psr.executeUpdate();
//			System.out.println("data delete data sucessfully");
//			psr.close();
//			con.close();
//		}catch(Exception e){
//			System.out.println(e);
//		}
//		System.out.println("enter id");
//		id=s.nextInt();
//		s.nextLine();
//		System.out.println("enter name");
//		name=s.nextLine();
//		try{
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
//			PreparedStatement st=con.prepareStatement(update);
//			
//			st.setString(1, name);
//			st.setInt(2, id);
//			st.executeUpdate();
//			System.out.println("data updated succesfully");
//			st.close();
//			con.close();
//			
//		}catch(Exception e)
//		{
//			System.out.println(e);
//		}
// 
	}
}
