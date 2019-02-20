package com.ssi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	private String email;
	private String password;
	private String sname;
	private String address;
	private String mobile;
	private String status="applied";
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
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Student(String email, String password, String sname, String address,
			String mobile) {
		super();
		this.email = email;
		this.password = password;
		this.sname = sname;
		this.address = address;
		this.mobile = mobile;
	}
	public Student() {
		super();
	}
	public Student(String email) {
		super();
		this.email = email;
	}
	
	
	
	
}
