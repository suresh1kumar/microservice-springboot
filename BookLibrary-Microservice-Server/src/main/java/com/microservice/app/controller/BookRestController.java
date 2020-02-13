package com.microservice.app.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.microservice.app.model.Book;
import com.microservice.app.service.BookService;
import com.microservice.app.service.BookServiceImpl;

@RestController
//@RequestMapping(value={"/book-management"})
@RequestMapping(value = "/book-management", produces = {MediaType.APPLICATION_JSON })
public class BookRestController {
	
	@Autowired
	private BookService bookService;
	
	/*@GetMapping(value="/getBook", headers="Accept=application/json")
    public List<Book> getAllUser() {
		System.out.println("\n\n\n***************"+bookServiceImpl.findAllBooks()+"***************");
        List<Book> tasks=bookServiceImpl.findAllBooks();
        return tasks;
    }*/
	
	@RequestMapping(value= "/getAllEmployee", method= RequestMethod.GET)
	public List<Book> getEmployees() {
		System.out.println(this.getClass().getSimpleName() + " - Get all employees service is invoked.");
		System.out.println(" \n\n- getEmployees ::"+bookService.getEmployees());
		
		return bookService.getEmployees();
	}

	@PostMapping(value="/getAllEmployee", headers="Accept=application/json")
	 //@RequestMapping(value = "/getUserData/", method = RequestMethod.POST)
	    public ResponseEntity<Void> createUser(@RequestBody Book book,UriComponentsBuilder ucBuilder) {
	        System.out.println("Creating User " + book.getBookTitle());
	 
	        /*if (userService.isUserExist(user)) {
	            System.out.println("A User with name " + user.getUserName() + " already exist");
	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	        }*/
	        System.out.println("saveOrUpdate11=================saveOrUpdate=11==================="+book);
	        bookService.saveOrUpdate(book);
	        System.out.println("saveOrUpdate=22================saveOrUpdate======22=============="+book);
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/getAllEmployee/{id}").buildAndExpand(book.getId()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
	 
	
	 //-------------------Retrieve Single User--------------------------------------------------------
	@GetMapping(value="/getAllEmployee/{id}", headers="Accept=application/json")
   //@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<Book> getUser(@PathVariable("id") int id) {
       System.out.println("Fetching User with id " + id);
       Book book = bookService.getUserById(id);
       if (book == null) {
           System.out.println("User with id " + id + " not found");
           return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
       }
       return new ResponseEntity<Book>(book, HttpStatus.OK);
   }
	 
	
	@PutMapping(value="/getAllEmployee/{id}", headers="Accept=application/json")
	//@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
   public ResponseEntity<Book> updateUser(@PathVariable("id") int id, @RequestBody Book book) {
		System.out.println("***************************Updating User ************************************" );
       
       System.out.println("Updating User " + id);
        
       Book currentBook = bookService.getUserById(id);
       System.out.println("Updating currentBook ID :: " + currentBook);
       if (currentBook==null) {
           System.out.println("User with id " + id + " not found");
           return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
       }else {
    	   
	        currentBook.setBookTitle(book.getBookTitle());
	        currentBook.setAuthorName(book.getAuthorName());
	        currentBook.setBookDescription(book.getBookDescription());
	        currentBook.setBookPrice(book.getBookPrice());
	        currentBook.setIsbn(book.getIsbn());
	        currentBook.setCreateDate(book.getCreateDate());
	         
	        bookService.saveOrUpdate(currentBook);
       }
       return new ResponseEntity<Book>(currentBook, HttpStatus.OK);
   }
	 
	 
	 
	//------------------- Delete a User --------------------------------------------------------
   @DeleteMapping(value="/getAllEmployee/{id}", headers="Accept=application/json")
   //@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
   public ResponseEntity<Book> deleteUser(@PathVariable("id") int id) {
       System.out.println("Fetching & Deleting User with id " + id);
       
       Book book = bookService.getUserById(id);
       if (book == null) {
           System.out.println("Unable to delete. User with id " + id + " not found");
           return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
       }
       
       bookService.deleteUser(id);
       return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	/*@RequestMapping(value= "/getAllEmployee/{id}", method= RequestMethod.GET)
	public Book getEmployeeById(@PathVariable int id) throws Exception {
		System.out.println(this.getClass().getSimpleName() + " - Get employee details by id is invoked.");

		Optional<Book> emp =  bookServiceImpl.getEmployeeById(id);
		System.out.println( " \n\n- getEmployeeById.::"+bookServiceImpl.getEmployeeById(id));
		if(!emp.isPresent())
			throw new Exception("Could not find employee with id- " + id);

		return emp.get();
	}

	
	@RequestMapping(value= "/getAllEmployee", method =  RequestMethod.POST )
	//public Book createEmployee(@RequestBody Book newemp,UriComponentsBuilder ucBuilder) {
	 public ResponseEntity<Void> createEmployee(@RequestBody Book newemp,UriComponentsBuilder ucBuilder) {
		System.out.println(this.getClass().getSimpleName() + " - Create new employee method is invoked.");
		System.out.println("---------------------::"+newemp.getId());
		System.out.println( "\n\n - Create new employee method is invoked. ::"+bookServiceImpl.addNewEmployee(newemp));
		
		bookServiceImpl.addNewEmployee(newemp);
        System.out.println("saveOrUpdate=22================saveOrUpdate======22=============="+newemp);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/getAllEmployee/{id}").buildAndExpand(newemp.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		
		
		//return bookServiceImpl.addNewEmployee(newemp);
	}

	@RequestMapping(value= "/getAllEmployee/{id}", method= RequestMethod.PUT)
	public Book updateEmployee(@RequestBody Book updemp, @PathVariable int id) throws Exception {
		
		System.out.println(this.getClass().getSimpleName() + " - Update employee details by id is invoked.");

		Optional<Book> emp =  bookServiceImpl.getEmployeeById(id);
		if (!emp.isPresent())
			throw new Exception("Could not find employee with id- " + id);

		if(updemp.getBookTitle() == null || updemp.getBookTitle().isEmpty())
			updemp.setBookTitle(emp.get().getBookTitle());
		
		if(updemp.getAuthorName() == null || updemp.getAuthorName().isEmpty())
			updemp.setAuthorName(emp.get().getAuthorName());
		
		if(updemp.getBookDescription() == null || updemp.getBookDescription().isEmpty())
			updemp.setBookDescription(emp.get().getBookDescription());
		
		if(updemp.getBookPrice() == 0)
			updemp.setBookPrice(emp.get().getBookPrice());
		
		if(updemp.getIsbn() == 0)
			updemp.setIsbn(emp.get().getIsbn());
		
		updemp.setId(id);
		System.out.println(" \n\n- Update find employee with id.::"+bookServiceImpl.getEmployeeById(id));
		System.out.println(" \n\n- Update employee details by id is invoked.::"+bookServiceImpl.updateEmployee(updemp));
		return bookServiceImpl.updateEmployee(updemp);
	}

	@RequestMapping(value= "/getAllEmployee/{id}", method= RequestMethod.DELETE)
	public void deleteEmployeeById(@PathVariable int id) throws Exception {
		System.out.println(this.getClass().getSimpleName() + " - Delete employee by id is invoked.");

		Optional<Book> emp =  bookServiceImpl.getEmployeeById(id);
		if(!emp.isPresent())
			throw new Exception("Could not find employee with id- " + id);
		System.out.println(" \n\n- Update employee details by id is invoked.::");
		bookServiceImpl.deleteEmployeeById(id);
	}

	@RequestMapping(value= "/employee/deleteall", method= RequestMethod.DELETE)
	public void deleteAll() {
		System.out.println(this.getClass().getSimpleName() + " - Delete all employees is invoked.");
		bookServiceImpl.deleteAllEmployees();
	}*/

}
