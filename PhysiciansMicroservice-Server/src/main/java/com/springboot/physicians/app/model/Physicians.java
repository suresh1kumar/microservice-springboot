package com.springboot.physicians.app.model;

public class Physicians {
	
	private long id;
	private String disease;
	private String medicinename;
	
	public Physicians() {
		
	}
	public Physicians(long id, String disease, String medicinename) {
		super();
		this.id = id;
		this.disease = disease;
		this.medicinename = medicinename;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getMedicinename() {
		return medicinename;
	}

	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}
	
	@Override
	public String toString() {
		return "Physicians [id=" + id + ", disease=" + disease + ", medicinename=" + medicinename + "]";
	}

}
