package com.springboot.admin.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 
import javax.validation.constraints.NotNull;

import com.springboot.admin.app.utils.ConstantUtils;
import com.springboot.admin.app.validator.Validate;

@Entity
@Table(name = "student")
public class Student {

	private static final long serialVersionUID = -7302800336276816169L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
	private Long id;
	
	@NotNull
	@Validate(min=5, max=30, regexp=ConstantUtils.CHAR_PATTERN, message="Please enter between {min}-{max} characters and no digits")
	private String name;
	
	@NotNull
	@Validate(min=10, max=100, regexp=ConstantUtils.EMAIL_PATTERN, message="Please enter between {min}-{max} characters and valid input")
	private String email;
	
	@NotNull
	@Validate(min=10, max=10, regexp=ConstantUtils.MOBILE_PATTERN, message="Please enter atleast {min} digits and no characters")
	private String mobile;
	
	@NotNull
	@Validate(min=5, max=30, regexp=ConstantUtils.CHAR_PATTERN, message="Please enter between {min}-{max} characters and no digits")
	private String country;
	
	@NotNull
	@Validate(min=5, max=30, regexp=ConstantUtils.CHAR_PATTERN, message="Please enter between {min}-{max} characters and no digits")
	private String city;
	
	@NotNull
	@Validate(min=5, max=30, regexp=ConstantUtils.CHAR_PATTERN, message="Please enter between {min}-{max} characters and no digits")
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student( @NotNull String name, @NotNull String email, @NotNull String mobile,
			@NotNull String country, @NotNull String city, @NotNull String address) {
		super();
		
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.country = country;
		this.city = city;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", country="
				+ country + ", city=" + city + ", address=" + address + "]";
	}

	
	
	
	
}
