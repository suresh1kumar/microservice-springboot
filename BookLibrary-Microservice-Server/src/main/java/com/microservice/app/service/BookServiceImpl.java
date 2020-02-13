package com.microservice.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.app.dao.BookRepository;
import com.microservice.app.model.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService { 

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getEmployees() {
		return bookRepository.findAll();
	}
	
	@Override
	public Book getUserById(int id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Book book) {
		bookRepository.save(book);
		
	}

	@Override
	public void deleteUser(int id) {
		bookRepository.deleteById(id);
		
	}
	/*@Override
	public Optional<Book> getEmployeeById(int empid) {
		return bookRepository.findById(empid);
	}
	@Override
	public List<Book> addNewEmployee(Book emp) {
		Book addbook=bookRepository.save(emp);
		return (List<Book>) addbook;
	}
	@Override
	public Book updateEmployee(Book emp) {
		return bookRepository.save(emp);
	}
	@Override
	public void deleteEmployeeById(int empid) {
		bookRepository.deleteById(empid);
	}
	@Override
	public void deleteAllEmployees() {
		bookRepository.deleteAll();
	}*/
	/*public Book getEmployeeByIds(int empid) {
		return bookRepository.getOne(empid);
	}*/

	
	
	

}
