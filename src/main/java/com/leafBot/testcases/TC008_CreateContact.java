package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC008_CreateContact extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC008_CreateContact";
		testDescription="Create a new Contact on LeafTaps";
		nodes = "Contacts";		
		dataSheetName="TC008";
		category="Smoke";
		authors="Hari";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createContact(String userName, String password, String firstName, String lastName) {
		new LoginPage(driver, node)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickContactsLink()
		.clickCreateContacts()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateContactSubmit()
		.verifyFirstName(firstName);
	}
	
}
