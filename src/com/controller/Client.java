package com.controller;
import com.pojo.Book;
import com.service.Book_Service;
public class Client {
	
	
	public static void main(String[] args) throws Exception {
		Book_Service bs=new Book_Service();
		Book b=new Book(1,"English Grammer", "Ronaldo", 231);
		bs.addBook(b);
		System.out.println("Book inserted into db successfully");
	}
	}

