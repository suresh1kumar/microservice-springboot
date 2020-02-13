package com.springboot.test.service;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
//import org.codehaus.jettison.json.JSONException;
//import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.dao.CommanUserRepo;
import com.springboot.test.model.CommanUser;

@Service
public class CommanUserServiceImpl implements CommanUserService{

	@Autowired
	private CommanUserRepo commanUserRepo;
	
	@Override
	public List<CommanUser> getAllUser() {
		
		return commanUserRepo.findAll();
	}

	@Override
	public CommanUser findOne(Long id) {
		
		return commanUserRepo.getOne(id);
	}
	
	@Override
	public String saveUser(CommanUser commanUser) {
		String message = null;
		JSONObject jsonObject = new JSONObject();
		System.out.println("\n\n\nuser.getUserId()11 ::"+commanUser.getUserId());
		try {
			if (commanUser.getUserId() == null) {
				message = "Added";
			} else {
				message = "Updated";
			}
			System.out.println("\nnuser.getUserId()221 ::"+commanUser.getUserId());
			commanUserRepo.save(commanUser);
			System.out.println("\nuser.getUserId()2221 ::"+commanUser.getUserId());
			jsonObject.put("status", "success");
			jsonObject.put("title", message+" Confirmation");
			System.out.println("\nnuser.getUserId()2266 ::"+commanUser.getUserId());
			jsonObject.put("message", "Address for "+commanUser.getUsername() +" "+ message + " successfully.");
		System.out.println("\n\n\njsonObject ::"+jsonObject);
		System.out.println("\n\n\nuser.getUserId()22 ::"+commanUser.getUserId());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
		
	}

	/*@Override
	public String addUser(CommanUser user) {
		
		String message = null;
		JSONObject jsonObject = new JSONObject();
		try {
			if(user.getId() == null) {
				message = "Added";
			} else {
				message = "Updated";
			}
			jsonObject.put("status", "success");
			jsonObject.put("title", message+" Confirmation");
			jsonObject.put("message", commanUserRepo.save(user).getUsername()+" "+message+" successfully.");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}*/

	@Override
	public void deleteUser(Long id) {
		
		 commanUserRepo.deleteById(id);
	}

	@Override
	public String updateUser(CommanUser commanUser) {
		String message = null;
		JSONObject jsonObject = new JSONObject();
		System.out.println("\n\n\nuser.getUserId()11 ::"+commanUser.getUserId());
		try {
			/*if (commanUser.getUserId() == null) {
				message = "Added";
			} else {
				message = "Updated";
			}*/
			message = "Updated";
			System.out.println("\nnuser.getUserId()221 ::"+commanUser.getUserId());
			commanUserRepo.save(commanUser);
			System.out.println("\nuser.getUserId()2221 ::"+commanUser.getUserId());
			jsonObject.put("status", "success");
			jsonObject.put("title", message+" Confirmation");
			System.out.println("\nnuser.getUserId()2266 ::"+commanUser.getUserId());
			jsonObject.put("message", "Address for "+commanUser.getUsername() +" "+ message + " successfully.");
		System.out.println("\n\n\njsonObject ::"+jsonObject);
		System.out.println("\n\n\nuser.getUserId()22 ::"+commanUser.getUserId());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}

}
