package com.searchstudents.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.searchstudents.dao.StudentDAO;
import com.searchstudents.dto.SearchParameters;
import com.searchstudents.dto.SearchResults;
@Service
public class StudentServiceImpl implements StudentService {
     @Autowired
	private StudentDAO studentDAO;
	public List<SearchResults>
	searchStudents(SearchParameters searchParams) {
List<SearchResults> list=studentDAO.searchStudents(searchParams);
		return list;
	}

}
