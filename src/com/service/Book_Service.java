package com.service;
import com.Dao.ServiceImpl;
import com.pojo.Book;


public class Book_Service implements ServicesInterface {
	
		@Override
		public void addBook(Book b) throws Exception {
			
			ServiceImpl.insertBook(b.getId(), b.getName(), b.getAuthor(), b.getPrice());
			
			
		}

		@Override
		public void updateBook(Book b) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteBook(Book b) {
			// TODO Auto-generated method stub
			
		}

	}


