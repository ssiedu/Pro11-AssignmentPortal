package com.ssi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	private String fcode;
	private String password;
	private String fname;
	private String qualification;
	private String address;
	private String mobile;
	private String email;
	public String getFcode() {
		return fcode;
	}
	public void setFcode(String fcode) {
		this.fcode = fcode;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Faculty(String fcode, String password, String fname,
			String qualification, String address, String mobile, String email) {
		super();
		this.fcode = fcode;
		this.password = password;
		this.fname = fname;
		this.qualification = qualification;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	public Faculty() {
		super();
	}
	public Faculty(String fcode) {
		super();
		this.fcode = fcode;
	}
	
	
}
