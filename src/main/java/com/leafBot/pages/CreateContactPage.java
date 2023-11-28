package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateContactPage extends ProjectSpecificMethods{

	public CreateContactPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
				
	}
	
	public CreateContactPage enterFirstName(String firstName){
		clearAndType(locateElement("id","firstNameField"), firstName);
		return this;

	}
	
	public CreateContactPage enterLastName(String lastName){
		clearAndType(locateElement("id","lastNameField"), lastName);
		return this;

	}
	
	
	public ViewContactPage clickCreateContactSubmit(){
		click(locateElement("class","smallSubmit"));
		return new ViewContactPage(driver, node);
	}
	
}
