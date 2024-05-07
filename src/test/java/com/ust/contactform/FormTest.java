package com.ust.contactform;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.ust.contactform.util.Data;
import com.ust.contactform.util.TestData;

public class FormTest {
	WebDriver driver;
	Data data = new Data();
	TestData tdata = new TestData();
	
	@BeforeTest
	public void startup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();//to maxmize the window
		driver.get(data.getBaseURL());
	}
	
	@Test(priority = 0)
	public void mainTest() throws InterruptedException {

		List<WebElement> chbx1 = driver.findElements(By.name(data.getDropdwnName()));//take data from the class data stored it in list
		chbx1.get(0).click();//taken one option from that
		driver.findElement(By.id(data.getSubID())).sendKeys(tdata.getSubject()+Keys.TAB + tdata.getMail()+ Keys.TAB + tdata.getTexboxdata()+Keys.TAB+tdata.getTextArea()); //clicking tab for each field and data to send is taken from test data class
		Select drpdwn1 = new Select(driver.findElement(By.id(data.getDropdownId())));//used select to select the option from the drop down
		drpdwn1.selectByIndex(2);//selecting 2nd index element that is 3rd element
		List<WebElement> radio1 = driver.findElements(By.name(data.getRadioName()));//storing to list
		radio1.get(0).click();
		driver.findElement(By.id(data.getCheckbox2id())).click();
		List<WebElement> chbx3 = driver.findElements(By.name(data.getCheckbox3name()));
		chbx3.get(3).click();
		driver.findElement(By.id(data.getDateboxid())).sendKeys(tdata.getDatadata());//taking the id of date field and sending date in the format
		Select drpdwn2 = new Select(driver.findElement(data.getDrpdwn2()));
		drpdwn2.selectByIndex(3);
		Select drpdwn3 = new Select(driver.findElement(data.getDrpdwon3()));
		drpdwn3.selectByIndex(2);
		Select drpdwn4 = new Select(driver.findElement(data.getDrpdwon4()));
		drpdwn4.selectByIndex(4);
		Select drpdwn5 = new Select(driver.findElement(data.getDrpdown5()));
		drpdwn5.selectByIndex(3);
		
		driver.findElement(data.getFname()).sendKeys(tdata.getFname());
		driver.findElement(data.getLname()).sendKeys(tdata.getLname());
		Select drpdwn6 = new Select(driver.findElement(data.getDOBMonth()));
		drpdwn6.selectByVisibleText(tdata.getDOBmonth());;;
		
		Select drpdwn7 = new Select(driver.findElement(data.getDOBDate()));
		drpdwn7.selectByVisibleText(tdata.getDOBdate());
		Select drpdwn8 = new Select(driver.findElement(data.getDOBYear()));
		drpdwn8.selectByVisibleText(tdata.getDOYear());
		
		driver.findElement(data.getAttach()).sendKeys(tdata.getPath());
//		List<WebElement> nuSites = driver.findElements(By.tagName("a"));
//		System.out.println(nuSites.size());//To find the total number of links
		Thread.sleep(10000);//To enter verification code
//		boolean expout = true;
//		boolean actualout = driver.findElement(data.getVerification()).getText().isEmpty();
//		assertEquals(expout,actualout);
		
		
	}
	@Test(priority = 1)
	public void submit() {
		driver.findElement(data.getSubmit()).click();
		assertEquals(data.getSucess(),driver.getTitle());
	}
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
