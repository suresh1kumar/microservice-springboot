package com.example.reposatory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

	@GetMapping(value="/")
	//@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
		
		return "Hello Spring world@!!";
	}
}
