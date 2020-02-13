package com.searchstudents.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.searchstudents.dto.SearchParameters;
import com.searchstudents.dto.SearchResults;
@Repository
public class StudentDAOImpl implements StudentDAO{
	@Autowired
private SessionFactory sessionFactory;
	public List<SearchResults>
 searchStudents(SearchParameters searchParams) {
List<SearchResults> searchResultsList=new 
ArrayList<SearchResults>();
if(searchParams!=null){		
StringBuffer hql=new StringBuffer("select s.studentId,s.name,s.mobile,s.course,s.city,s.state  from com.searchstudents.domain.Student as s ");
boolean isFirst=true;
if(searchParams.getStudentId()!=null && 
searchParams.getStudentId()>0){
  hql.append(" where s.studentId="+searchParams.getStudentId());
isFirst=false;
}
if(searchParams.getName()!=null 
&& searchParams.getName().trim().length()>0){
	if(isFirst){
  hql.append(" where s.name='"+searchParams.getName()+"'");		
	isFirst=false;
	}else{
hql.append(" And s.name='"+searchParams.getName()+"'");		
	}
}


if(searchParams.getMobile()!=null 
&& searchParams.getMobile().trim().length()>0){
	if(isFirst){
  hql.append(" where s.mobile='"+searchParams.getMobile()+"'");		
	isFirst=false;
	}else{
hql.append(" And s.mobile='"+searchParams.getMobile()+"'");		
	}
}

if(searchParams.getCourse()!=null 
&& searchParams.getCourse().trim().length()>0){
	if(isFirst){
  hql.append(" where s.course='"+searchParams.getCourse()+"'");		
	isFirst=false;
	}else{
hql.append(" And s.course='"+searchParams.getCourse()+"'");		
	}
}
Session session=sessionFactory.openSession();
Query query=session.createQuery(hql.toString());
   List<Object[]>  list=query.list();
   for(Object[] obj:list){
SearchResults searchResults=new SearchResults();
    searchResults.setSid((Integer)obj[0]);
    searchResults.setName((String)obj[1]);
    searchResults.setMobile((String)obj[2]);
    searchResults.setCourse((String)obj[3]);
    searchResults.setCity((String)obj[4]);
    searchResults.setState((String)obj[5]);
    searchResultsList.add(searchResults);
   }
session.close();
}
return searchResultsList;
	}
}
