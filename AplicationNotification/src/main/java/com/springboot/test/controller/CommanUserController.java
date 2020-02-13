package com.springboot.test.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.model.CommanUser;
import com.springboot.test.service.CommanUserService;
import com.springboot.test.util.ErrorUtils;  

@RestController 
//@Controller  
//@RequestMapping(value={"/user"})  
public class CommanUserController {  

	@Autowired  
	CommanUserService commanUserService;
	 
	
	//@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value = "/user", method = RequestMethod.POST, headers = "Accept=application/json")
	public @ResponseBody String addressAdd(@Valid @RequestBody CommanUser commanUsers, BindingResult result) {
		 System.out.println("************************ << Add Record Controller >> ************************\n");
		 System.out.println("\n------------------------------------------------------------------------------------------------------");
		 System.out.println("UserId\t     Username\t Email\t\t Mobile\t\t Country\t Collage\t City");
		 System.out.println("------------------------------------------------------------------------------------------------------");
		 System.out.println(commanUsers.getUserId()+"    \t"+commanUsers.getUsername()+"  "+commanUsers.getEmail()+"\t"+commanUsers.getMobile()+"\t"+commanUsers.getCountry()+"\t\t"+commanUsers.getCollage()+"\t\t"+commanUsers.getCity());
		 System.out.println("\n------------------------------------------------------------------------------------------------------");
		 CommanUser currentUser =null;
		 if(commanUsers.getUserId()!=0){
			 currentUser = commanUserService.findOne(commanUsers.getUserId());
		 }
		    
		if(result.hasErrors()) {
			return ErrorUtils.customErrors(result.getAllErrors());
		} else if(currentUser==null){
			System.out.println("Add Record Controller");
			return commanUserService.saveUser(commanUsers);
		}else {
			System.out.println("update Record Controller");
			currentUser.setCity(commanUsers.getCity());
	        currentUser.setCollage(commanUsers.getCollage());
	        currentUser.setCountry(commanUsers.getCountry());
	        currentUser.setEmail(commanUsers.getEmail());
	        currentUser.setMobile(commanUsers.getMobile());
	        currentUser.setUsername(commanUsers.getUsername());
			return commanUserService.saveUser(currentUser);
		}
	}
	
	
    @RequestMapping(value = "/getUserData", method = RequestMethod.GET)
    public ResponseEntity<List<CommanUser>> listAllUsers() {
        List<CommanUser> users = commanUserService.getAllUser();
        System.out.println("getAll User ::"+users);
        if(users.isEmpty()){
            return new ResponseEntity<List<CommanUser>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<CommanUser>>(users, HttpStatus.OK);
    }
	
    //@DeleteMapping(value="/getUserData/{userId}", headers="Accept=application/json")
    @RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.DELETE)
    public ResponseEntity<CommanUser> deleteUser(@PathVariable("userId") Long userId) {
        System.out.println("Fetching & Deleting User with id " + userId);
        
        CommanUser user = commanUserService.findOne(userId);
        if (user == null) {
            System.out.println("Unable to delete. User with id " + userId + " not found");
            return new ResponseEntity<CommanUser>(HttpStatus.NOT_FOUND);
        }
        commanUserService.deleteUser(userId);
        return new ResponseEntity<CommanUser>(HttpStatus.NO_CONTENT);
    }
    
   
    
    //@PutMapping(value="/getUserData/{userId}", headers="Accept=application/json")
    @RequestMapping(value = "/getUserData/{userId}", method = RequestMethod.PUT, headers = "Accept=application/json")
    public ResponseEntity<CommanUser> updateUser(@Valid @PathVariable("userId") long userId, @RequestBody CommanUser commanUsers) {
		System.out.println("***************************Updating User ************************************" );
        
        System.out.println("Updating User " + userId);
         
        CommanUser currentUser = commanUserService.findOne(userId);
        System.out.println("Updating currentUser ID :: " + currentUser);
        if (currentUser==null) {
            System.out.println("User with id " + userId + " not found");
            return new ResponseEntity<CommanUser>(HttpStatus.NOT_FOUND);
        }else {
        	
	        currentUser.setCity(commanUsers.getCity());
	        currentUser.setCollage(commanUsers.getCollage());
	        currentUser.setCountry(commanUsers.getCountry());
	        currentUser.setEmail(commanUsers.getEmail());
	        currentUser.setMobile(commanUsers.getMobile());
	        currentUser.setUsername(commanUsers.getUsername());
	         
	        commanUserService.updateUser(currentUser);
        }
        return new ResponseEntity<CommanUser>(currentUser, HttpStatus.OK);
    }
	
    //@GetMapping("/list/{id}")
    @RequestMapping(value = "/getUserData/{id}", method = RequestMethod.GET)
	public CommanUser findOne(@PathVariable Long userId) {
    	System.out.println("\n\n\n\nfindOne Updating User id:: " + userId);
		return commanUserService.findOne(userId);
	}
    
    
    
    
    
    
    
	
	/* @RequestMapping(value = "/user2", method = RequestMethod.POST,consumes ="application/json",  produces="application/json")  
	 //@ResponseBody
	    public CommanUser addEmployee(@RequestBody CommanUser commanUser) {
	  
	        System.out.println("(Service Side) Creating employee with empNo: " + commanUser.getUsername());
	  
	        return commanUserService.saveOrUpdate(commanUser);
	    }*/
	
	/*@RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody CommanUser commanUser, UriComponentsBuilder ucBuilder) {
		System.out.println("\n\n\n===========================================");
		System.out.println("Creating User " + commanUser.getUsername());
        
        commanUserService.saveOrUpdate(commanUser);
 
        HttpHeaders headers = new HttpHeaders();
        //headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getUserId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }*/
	//@PostMapping(value="/getUserData", headers="Accept=application/json")
	/* @RequestMapping(value = "/getUserData", method = RequestMethod.POST)
	    public String createUsera(@RequestBody CommanUser user,UriComponentsBuilder ucBuilder) {
	        System.out.println("Creating User " + user.getUsername());
	 
	        if (userService.isUserExist(user)) {
	            System.out.println("A User with name " + user.getUserName() + " already exist");
	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	        }
	        System.out.println("saveOrUpdate11=================saveOrUpdate=11==================="+user);
	        commanUserService.saveOrUpdate(user);
	        System.out.println("saveOrUpdate=22================saveOrUpdate======22=============="+user);
	        HttpHeaders headers = new HttpHeaders();
	      //  headers.setLocation(ucBuilder.path("/getUserData/{userId}").buildAndExpand(user.getUserId()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }*/
}
