package com.ust.contactform.util;

import org.openqa.selenium.By;

public class Data {
	//declaring data as private and creating getter and setter to fetch
	private String baseURL = "https://www.mycontactform.com/samples.php";
	private String title = "Sample Email Forms - myContactForm.com";
	private String subID = "subject";
	private String emailid = "email";
	private String sucess = "Thank You - myContactForm.com";
	public String getBaseURL() {
		return baseURL;
	}
	public String getSucess() {
		return sucess;
	}
	public void setSucess(String sucess) {
		this.sucess = sucess;
	}
	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubID() {
		return subID;
	}
	public void setSubID(String subID) {
		this.subID = subID;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getTextID() {
		return textID;
	}
	public void setTextID(String textID) {
		this.textID = textID;
	}
	public String getTextareaID() {
		return textareaID;
	}
	public void setTextareaID(String textareaID) {
		this.textareaID = textareaID;
	}
	public String getDropdownId() {
		return dropdownId;
	}
	public void setDropdownId(String dropdownId) {
		this.dropdownId = dropdownId;
	}
	public String getDropdwnName() {
		return dropdwnName;
	}
	public void setDropdwnName(String dropdwnName) {
		this.dropdwnName = dropdwnName;
	}
	public String getRadioName() {
		return radioName;
	}
	public void setRadioName(String radioName) {
		this.radioName = radioName;
	}
	public String getCheckbox2id() {
		return checkbox2id;
	}
	public void setCheckbox2id(String checkbox2id) {
		this.checkbox2id = checkbox2id;
	}
	public String getCheckbox3name() {
		return checkbox3name;
	}
	public void setCheckbox3name(String checkbox3name) {
		this.checkbox3name = checkbox3name;
	}
	public String getDateboxid() {
		return dateboxid;
	}
	public void setDateboxid(String dateboxid) {
		this.dateboxid = dateboxid;
	}
	public By getDrpdwn2() {
		return drpdwn2;
	}
	public void setDrpdwn2(By drpdwn2) {
		this.drpdwn2 = drpdwn2;
	}
	public By getDrpdwon3() {
		return drpdwon3;
	}
	public void setDrpdwon3(By drpdwon3) {
		this.drpdwon3 = drpdwon3;
	}
	public By getDrpdwon4() {
		return drpdwon4;
	}
	public void setDrpdwon4(By drpdwon4) {
		this.drpdwon4 = drpdwon4;
	}
	public By getDrpdown5() {
		return drpdown5;
	}
	public void setDrpdown5(By drpdown5) {
		this.drpdown5 = drpdown5;
	}
	private String textID = "q1";
	private String textareaID = "q2";
	private String dropdownId = "q3";
	private String dropdwnName = "email_to[]";
	private String radioName = "q4";
	private String checkbox2id = "q5";
	private String checkbox3name = "checkbox6[]";
	private String dateboxid ="q7";
	

	private By drpdwn2 = By.id("q8");
	private By drpdwon3 = By.id("q9");
	public By getVerification() {
		return verification;
	}
	public void setVerification(By verification) {
		this.verification = verification;
	}
	private By drpdwon4 = By.id("q10");
	private By drpdown5 = By.name("q11_title");
	private By Fname = By.name("q11_first");
	private By Lname = By.name("q11_last");
	private By verification = By.id("visver_code");
	public By getDOBMonth() {
		return DOBMonth;
	}
	public void setDOBMonth(By dOBMonth) {
		DOBMonth = dOBMonth;
	}
	public By getDOBDate() {
		return DOBDate;
	}
	public void setDOBDate(By dOBDate) {
		DOBDate = dOBDate;
	}
	public By getDOBYear() {
		return DOBYear;
	}
	public void setDOBYear(By dOBYear) {
		DOBYear = dOBYear;
	}
	private By DOBMonth = By.name("q12_month");
	private By DOBDate = By.name("q12_day");
	private By DOBYear = By.name("q12_year");
	private By Attach = By.id("attach4589");
	private By submit = By.name("submit");
	public By getSubmit() {
		return submit;
	}
	public void setSubmit(By submit) {
		this.submit = submit;
	}
	public By getAttach() {
		return Attach;
	}
	public void setAttach(By attach) {
		Attach = attach;
	}
	public By getFname() {
		return Fname;
	}
	public void setFname(By fname) {
		Fname = fname;
	}
	public By getLname() {
		return Lname;
	}
	public void setLname(By lname) {
		Lname = lname;
	}
	
	
	
	
	

}
