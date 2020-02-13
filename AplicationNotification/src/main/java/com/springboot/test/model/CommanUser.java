package com.springboot.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springboot.test.util.ConstantUtils;


@Entity
@Table(name = "commanUsers")
public class CommanUser{// extends AbstractPersistable<Long> {
	//private static final long serialVersionUID = -7302800336276816169L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	
	@NotNull
	@Size(min=5, max=20, message="Please enter between {min}-{max} characters and digits")
	@Pattern(regexp=ConstantUtils.CHAR_PATTERN, message="Please enter only characters and digits")
	private String username;
	
	@NotNull
	@Size(min=3, max=20, message="Please enter between {min}-{max} characters")
	@Pattern(regexp=ConstantUtils.CHAR_PATTERN, message="Please enter only characters")
	private String collage; 
	
	@NotNull
	@Size(min=5, max=20, message="Please enter between {min}-{max} characters")
	@Pattern(regexp=ConstantUtils.CHAR_PATTERN, message="Please enter only characters")
	private String country;
	
	@NotNull
	@Size(min=5, max=100, message="Please enter between {min}-{max} characters")
	@Pattern(regexp=ConstantUtils.CHAR_PATTERN, message="Please enter only characters and digits")
	private String city;
	
	@NotNull
	@Size(min=6, max=100, message="Please enter between {min}-{max} characters")
	@Pattern(regexp=ConstantUtils.EMAIL_PATTERN, message="Please enter only valid input")
	private String email;   
	
	@NotNull
	@Size(min=10, max=10, message="Please enter atleast {min} digits")
	//@Pattern(regexp=ConstantUtils.MOBILE_PATTERN, message="Please enter only digits")
	private String mobile;

	public CommanUser() {

	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	

	@Override
	public String toString() {
		return "CommanUser [userId=" + userId + ", username=" + username + ", collage=" + collage + ", country=" + country + ", city=" + city
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}

	
	
	
	
}
