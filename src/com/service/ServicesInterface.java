package com.service;
import com.pojo.Book;
public interface ServicesInterface {
	

	void addBook(Book b)throws Exception;
	void updateBook(Book b);
	void deleteBook(Book b);
	}


