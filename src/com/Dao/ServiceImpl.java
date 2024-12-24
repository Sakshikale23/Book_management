package com.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ServiceImpl {
	
	private static final String Db_url="jdbc:mysql://localhost:3307/bookproject";
	private static final String username="root";
	private static final String password="root";
	private static PreparedStatement pstmt;
	private static Connection con;
		
	public static Connection dbconnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(Db_url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return con;
	}
		
		public static int insertBook(int id,String name,String author,double price) throws Exception
		{
			Connection con =dbconnection();
			String sql="insert into book values (?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, author);
			pstmt.setDouble(4, price);
			int i=pstmt.executeUpdate();
			return i;
		}
		
	}


