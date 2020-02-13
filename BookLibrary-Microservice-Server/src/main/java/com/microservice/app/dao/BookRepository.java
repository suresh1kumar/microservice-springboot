package com.microservice.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.app.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
//public interface BookRepository {

	/*Optional<Book> findById(int bookId);

	List<Book> findAllBooks();

	void addBook(Book book);

	void deleteBook(int bookId);
	
	void updateBook(Book book);*/

//}
