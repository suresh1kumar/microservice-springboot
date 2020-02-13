package com.searchstudents.dao;

import java.util.List;

import com.searchstudents.dto.SearchParameters;
import com.searchstudents.dto.SearchResults;

public interface StudentDAO {

	List<SearchResults> searchStudents(SearchParameters searchParams);

}
