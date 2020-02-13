package com.springboot.institute.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.*;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "addressId")
    private Long addressId;
    
    @Column(name = "detail")
    private String detail;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "zip")
    private Integer zip;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient   
    private List<Contact> contactList;   
   
    public Address() {
    }

    public Address(Long addressId) {
        this.addressId = addressId;
    }

    public Address(String detail) {
        this.detail = detail;
    }
    

    public Address(String detail, String city, String country, Integer zip) {
        this.detail = detail;
        this.city = city;
        this.country = country;
        this.zip = zip;
    }
    

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    @Override
	public String toString() {
		return "Address [addressId=" + addressId + ", detail=" + detail + ", city=" + city + ", country=" + country
				+ ", zip=" + zip + ", contactList=" + contactList + "]";
	}

	public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
    
    
}
