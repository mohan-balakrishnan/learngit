package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class EditContactPage extends ProjectSpecificMethods{

	public EditContactPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
				
	}
	
	public EditContactPage enterDescription(String description){
		clearAndType(locateElement("id","updateContactForm_description"), description);
		return this;
	}
	
	public ViewContactPage clickUpdateContactSubmit(){
		click(locateElement("class","smallSubmit"));
		return new ViewContactPage(driver, node);
	}
	
	
}
