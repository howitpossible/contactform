package com.ust.contactform.util;

import java.io.File;

public class TestData {
	////declaring data as private and creating getter and setter to fetch
	private String subject = "Medical";
	private String mail = "abhi@gmail.com";
	private String texboxdata = "Hello";
	private String textArea = "Abhinav Nivas Vilakkode Vilakkode PO pin:670703";
	private String datadata = "05-08-2023";
	private String fname = "Abhinav";
	private String lname = "Selvarajan";
	private String DOBdate = "8";
	private String DOBmonth = "5";
	private String DOBYear = "2002";
	File file  = new File("externaldata/Fileforupload.txt");
	private String path = file.getAbsolutePath();

	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getDOBYear() {
		return DOBYear;
	}
	public void setDOBYear(String dOBYear) {
		DOBYear = dOBYear;
	}

	public String getDOBdate() {
		return DOBdate;
	}

	public void setDOBdate(String dOBdate) {
		DOBdate = dOBdate;
	}
	public String getDOBmonth() {
		return DOBmonth;
	}
	public void setDOBmonth(String dOBmonth) {
		DOBmonth = dOBmonth;
	}
	public String getDOYear() {
		return DOBYear;
	}
	public void setDOYear(String dOYear) {
		DOBYear = dOYear;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDatadata() {
		return datadata;
	}
	public void setDatadata(String datadata) {
		this.datadata = datadata;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTexboxdata() {
		return texboxdata;
	}
	public void setTexboxdata(String texboxdata) {
		this.texboxdata = texboxdata;
	}
	public String getTextArea() {
		return textArea;
	}
	public void setTextArea(String textArea) {
		this.textArea = textArea;
	}

}
