package com.microservice.app.service;

import java.util.List;
import java.util.Optional;

import com.microservice.app.model.Book;

public interface BookService {
	
	
	public List<Book> getEmployees();
	/*public Optional<Book> getEmployeeById(int empid);
	public List<Book> addNewEmployee(Book emp);
	public Book updateEmployee(Book emp);
	public void deleteEmployeeById(int empid);
	public void deleteAllEmployees();*/
	
	
	public Book getUserById(int id);
	 
	 public void saveOrUpdate(Book user);
	 
	 public void deleteUser(int id);
	//public Book getEmployeeByIds(int empid);
	
	/*Book findById(Integer bookId);
	List<Book> findAllBooks();
	void addBook(Book book);
	void deleteBook(int bookId);
	void updateBook(Book book);*/
}
