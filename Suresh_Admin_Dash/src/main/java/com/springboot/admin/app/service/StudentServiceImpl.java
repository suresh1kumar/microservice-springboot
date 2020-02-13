package com.springboot.admin.app.service;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.admin.app.dao.StudentReposatory;
import com.springboot.admin.app.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	public StudentReposatory studentReposatory;
	@Override
	public String addStudent(Student student) {
		String message = null;
		JSONObject jsonObject = new JSONObject();
		
		System.out.println("\n\n\n************888StudentServiceImpl********************");
		try {
			if (student.getId() == null) {
				message = "Added";
			} else {
				message = "Updated";
			}
			studentReposatory.save(student);
			jsonObject.put("status", "success");
			jsonObject.put("title", message+" Confirmation");
			jsonObject.put("message", "Address for "+student.getName() +" "+ message + " successfully.");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}

}
