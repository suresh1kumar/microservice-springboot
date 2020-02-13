package com.searchstudents.service;

import java.util.List;

import com.searchstudents.dto.SearchParameters;
import com.searchstudents.dto.SearchResults;

public interface StudentService {

	List<SearchResults> searchStudents(SearchParameters searchParams);

}
