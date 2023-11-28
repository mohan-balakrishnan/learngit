package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewContactPage extends ProjectSpecificMethods{

	public ViewContactPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
				
	}
	
	public ViewContactPage verifyFirstName(String firstName) {
		verifyPartialText(locateElement("id","viewContact_firstName_sp"), firstName);
		return this;
	}
	
	public ViewContactPage verifyDescription(String description) {
		verifyPartialText(locateElement("id","viewContact_description_sp"), description);
		return this;
	}
	
	public EditContactPage clickEditContactLink(){
		click(locateElement("link","Edit"));
		return new EditContactPage(driver, node);
	}
	
	public ViewContactPage clickDeactivateContactLink(){
		click(locateElement("link","Deactivate Contact"));
		return this;
	}
	
	public ViewContactPage acceptDeactivateContact() {
		acceptAlert();
		return this;
	}

	public ViewContactPage dismissDeactivateContact() {
		dismissAlert();
		return this;
	}
}
