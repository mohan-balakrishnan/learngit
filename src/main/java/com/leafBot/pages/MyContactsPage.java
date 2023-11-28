package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyContactsPage extends ProjectSpecificMethods{

	public MyContactsPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
		
	}
	
	// Click Create Contacts 
		public CreateContactPage clickCreateContacts(){
			click(locateElement("link","Create Contact"));
			return new CreateContactPage(driver, node);
		}
		
		public FindContactPage clickFindContacts(){
			click(locateElement("link","Find Contacts"));	
			return new FindContactPage(driver, node);
		}
}
