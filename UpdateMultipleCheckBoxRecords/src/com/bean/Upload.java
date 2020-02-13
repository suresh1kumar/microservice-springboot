package com.bean;

public class Upload {
	
	private int id;
	private String name;
	private String price;
	private String status;
	public Upload() {
		
	}
	@Override
	public String toString() {
		return "Upload [id=" + id + ", name=" + name + ", price=" + price + ", status=" + status + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Upload(int id, String name, String price, String status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.status = status;
	}
	
	
	
	

}
