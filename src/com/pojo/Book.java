package com.pojo;

import java.sql.DriverManager;
import java.sql.Statement;

public class Book {
	  private static final String db_url="jdbc:mysql://localhost:3306/batch_1203";
	   private static final String username="root";
	   private static final String password="root";
	   public static java.sql.Connection  con=null;
	   public static Statement stmt=null;
	   
	   public  java.sql.Connection dbconnection1()
	   {
		 	
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   con=DriverManager.getConnection(db_url,username,password);
		   System.out.println("connection succesfull");
	   }
	   catch (Exception e) {
		   e.printStackTrace();
	   }
	   return  con;
	}
	  public  Book()
	 {
		 dbconnection1();
		 try {
			stmt=con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	 }
		

	private int id;
	private String name;
	private String author;
	private double price;
	public Book(int id, String name, String author, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	}


