package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class FindContactPage extends ProjectSpecificMethods{

	public FindContactPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
	}
	
	public FindContactPage enterFirstName(String findfirstname){
		clearAndType(locateElement("xpath","(//input[@name='firstName'])[3]"), findfirstname);
		return this;

	}
	
	public FindContactPage clickFindContactsButton(){
		click(locateElement("xpath","//button[text()='Find Contacts']"));
		return this;
	}
	
	public String getFirstResultingContact(){	
		return 	getElementText(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	}
	
	public String getFirstResultingFirstName() throws InterruptedException{	
		Thread.sleep(1000);
		return 	getElementText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
	}
	
	public ViewContactPage clickFirstResultingContact(){
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		return new ViewContactPage(driver, node);
	}
}
