package com.stream.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student{
	int sid;
	String sname;
	String prise;
	
	public Student(int sid, String sname, String prise) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.prise = prise;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", prise=" + prise + "]";
	}
	
	
	
}


public class JavaStreamExample {
public static void main(String[] args) {
	

	List<Student> SList=new ArrayList<Student>();
	SList.add(new Student(101,"Ram","500"));
	SList.add(new Student(102,"Raja","600"));
	
	List<Student> pList=(List<Student>) SList.stream()
			.filter(p->p.sid>10).limit(1)
			.collect(Collectors.toList());
  
	
	System.out.println("\nlist ::"+pList.toString());
			  

	
}
}
