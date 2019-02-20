package com.ssi.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Assignment {
	@Id
	private int acode;
	private String question;
	private Date adate;
	private String subject;
	@ManyToOne
	private Faculty factulty;
	public int getAcode() {
		return acode;
	}
	public void setAcode(int acode) {
		this.acode = acode;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Date getAdate() {
		return adate;
	}
	public void setAdate(Date adate) {
		this.adate = adate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Faculty getFactulty() {
		return factulty;
	}
	public void setFactulty(Faculty factulty) {
		this.factulty = factulty;
	}
	
	
	
}
